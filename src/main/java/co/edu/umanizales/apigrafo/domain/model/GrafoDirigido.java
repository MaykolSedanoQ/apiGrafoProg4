package co.edu.umanizales.apigrafo.domain.model;

import java.util.ArrayList;
import java.util.List;

public class GrafoDirigido extends Grafo {

    @Override
    public boolean validarExistenciaArista(Arista arista){
        for (Arista ari:getAristas()){
            if (ari.getOrigen()==arista.getOrigen() && ari.getDestino() == arista.getDestino()
            && ari.getPeso() == arista.getPeso()){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Arista> obtenerAdyacencias (int origen){
        List<Arista> listado= new ArrayList<>();
        for (Arista ari: getAristas()){
            if (ari.getOrigen()== origen){
                listado.add(ari);
            }
        }
        return listado;
    }

    public List<Arista> obtenerAdyuacenciasEntrantes(int vertice){
        List<Arista> listado = new ArrayList<>();
        for (Arista ari: getAristas()){
            if (ari.getDestino()== vertice){
                listado.add(ari);
            }
        }
        return listado;
    }
}
