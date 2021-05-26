package co.edu.umanizales.apigrafo.domain.model.dijkstra;

import co.edu.umanizales.apigrafo.domain.model.Arista;
import co.edu.umanizales.apigrafo.domain.model.Grafo;
import co.edu.umanizales.apigrafo.domain.model.GrafoDirigido;
import co.edu.umanizales.apigrafo.domain.model.Vertice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dijkstra  implements Serializable {

    private short origen;
    private short destino;
    private List<VerticeDijkstra> verticesD;
    private int marcados;
    private Grafo grafo;

    public Dijkstra(short origen, short destino, Grafo grafo) {
        this.origen = origen;
        this.destino = destino;
        this.grafo = grafo;

        //crear vertices dijkstra

    }

    public void llenarVerticesDijkstra(){
        verticesD= new ArrayList<>();
        //recorrer todos los vertices del grafo
        for (Vertice vertGrafo: grafo.getVertices()){

            //parado en un vertice del grafo
            VerticeDijkstra vertD = new VerticeDijkstra(vertGrafo.getCodigo(),null,(short)0);
            verticesD.add(vertD);
        }
    }

    public List<VerticeDijkstra> calcularDijkstra(){
        VerticeDijkstra verActual;
        //1-Pararme en el origen
        verActual= obtenerVerticexCodigo(origen);
        //null y peso 0
        calcularDijkstra(verActual);
        //si tengo ruta o no tiene
        return null;
    }

    public void calcularDijkstra(VerticeDijkstra verActual){
        //2-asigno de donde viene y el peso acumulado que trae
        //3- obtener adyacencias del vertice en el que estoy
        List<Arista> adyacencias= grafo.obtenerAdyacencias(verActual.getCodigo());
        //4- visito todas las adyacencias
        //5- cada adyacencia actualizo su origen y peso acumulado cuando es menor
        actualizarAdyacencias(verActual, adyacencias);
        //6- marcar en el que estoy parado
        //6.1 verificar si ya todos estan marcados voy al punto 8 cuando todos verticesD esten marcado-marcados= verticesD.size()

        verActual.setMarcados(true);
        this.marcados++;
        if (marcados== grafo.getVertices().size()){

        }else{
            //7 salto a la adyacencia menor no marcada volver al punto 2
            VerticeDijkstra verMenorNoVisitado= obtenerAdyacenciaMenorNoVisitada(adyacencias, verActual);
            calcularDijkstra(verMenorNoVisitado);
        }
    }

    public short getOrigen() {
        return origen;
    }

    public void setOrigen(short origen) {
        this.origen = origen;
    }

    public short getDestino() {
        return destino;
    }

    public void setDestino(short destino) {
        this.destino = destino;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public VerticeDijkstra obtenerVerticexCodigo (int codigo){
        //objetos son refencias en memoria
        for (VerticeDijkstra vertD: verticesD){
            if (vertD.getCodigo()== codigo){
                return vertD;
            }
        }
        return null;
    }

    private void actualizarAdyacencias (VerticeDijkstra verActual, List<Arista> adyacencias){
        //Obtener las adyacencias de verticesD
        //recorriendo las aristas del grafo
        // actualizo los pesos y anterior de las adyacencias
        // si esta nulo el anterior actualizo el anterior con el vertice
        //actual
        // si no esta nulo comparo si es menor el peso acumulado para
        //actualizar
        for(Arista ari:adyacencias)
        {
            VerticeDijkstra visitado= obtenerVerticexCodigo(ari.getDestino());
            //Actualizarle su origen y peso
            if(visitado.getAnterior()==null)
            {
                //NO ha sido visitado
                visitado.setAnterior(verActual);
                visitado.setPeso((short)(verActual.getPeso()+ari.getPeso()));
            }
            else
            {
                short pesoAcumulado=(short)(verActual.getPeso()+ari.getPeso());
                if(pesoAcumulado < visitado.getPeso())
                {
                    visitado.setAnterior(verActual);
                    visitado.setPeso(pesoAcumulado);
                }
            }
        }
    }


    private VerticeDijkstra obtenerAdyacenciaMenorNoVisitada(List<Arista> adyacencias,
                                                             VerticeDijkstra anterior)
    {
        //Menor peso acumulado
        // cuando dos vertices tienen el mismo salta a cualquiera
        short menor= Short.MAX_VALUE;
        VerticeDijkstra verticeSalto =null;
        for(Arista ari: adyacencias)
        {
            int codigoVerticeAnalizar=0;
            //Si mi grafo es dirigido a no es dirigido
            if(grafo instanceof GrafoDirigido)
            {
                //Siempre voy a obtener el vertice que voy a analizar con el destino
                codigoVerticeAnalizar= ari.getOrigen();
            }
            else
            {
                // Yo tengo que determinar si debo buscar el vertice a analizar con el
                // origen de la arista o con el destino
                codigoVerticeAnalizar= ari.getOrigen();
                if(ari.getOrigen()== anterior.getCodigo())
                {
                    codigoVerticeAnalizar= ari.getDestino();
                }

            }
            VerticeDijkstra vertAdyacente = obtenerVerticexCodigo(codigoVerticeAnalizar);

            if(!vertAdyacente.isMarcados()) //Me interesan los que no estén marcados
            {
                if(vertAdyacente.getPeso() < menor)
                {
                    //Actualizar el menor  y marcar ese vertice como al que debo
                    //saltar
                    menor= vertAdyacente.getPeso();
                    verticeSalto = vertAdyacente;
                }
            }

        }
        //Se puede presentar el bloqueo y hay que saltar a cualquiera
        if(verticeSalto == null)
        {
            //Un bloqueo salto a cualquiera no marcado
            for(VerticeDijkstra vertD: verticesD)
            {
                if(!vertD.isMarcados())
                {
                    return vertD;
                }
            }
        }
        return verticeSalto;
    }


}
