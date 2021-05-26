package co.edu.umanizales.apigrafo.domain.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AristaPK implements Serializable {
    private int origen;
    private int destino;
    private double peso;

    @Column(name = "origen")
    @Id
    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    @Column(name = "destino")
    @Id
    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    @Column(name = "peso")
    @Id
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AristaPK aristaPK = (AristaPK) o;

        if (origen != aristaPK.origen) return false;
        if (destino != aristaPK.destino) return false;
        if (Double.compare(aristaPK.peso, peso) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = origen;
        result = 31 * result + destino;
        temp = Double.doubleToLongBits(peso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
