package co.edu.umanizales.apigrafo.domain.model.dijkstra;

import java.io.Serializable;

public class VerticeDijkstra implements Serializable {

    private int codigo;
    private VerticeDijkstra anterior;
    private short peso;
    private boolean marcado;

    public VerticeDijkstra(int codigo, VerticeDijkstra anterior, short peso) {
        this.codigo = codigo;
        this.anterior = anterior;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public VerticeDijkstra getAnterior() {
        return anterior;
    }

    public void setAnterior(VerticeDijkstra anterior) {
        this.anterior = anterior;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    public boolean isMarcados() {
        return marcado;
    }

    public void setMarcados(boolean marcados) {
        this.marcado = marcados;
    }
}
