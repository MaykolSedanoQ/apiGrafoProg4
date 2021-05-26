package co.edu.umanizales.apigrafo.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AristaPK.class)
public class Arista {
    private int origen;
    private int destino;
    private double peso;

    @Id
    @Column(name = "origen")
    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    @Id
    @Column(name = "destino")
    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    @Id
    @Column(name = "peso")
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

        Arista arista = (Arista) o;

        if (origen != arista.origen) return false;
        if (destino != arista.destino) return false;
        if (Double.compare(arista.peso, peso) != 0) return false;

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
