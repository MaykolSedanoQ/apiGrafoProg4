package co.edu.umanizales.apigrafo.domain.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import springfox.documentation.spring.web.json.Json;

public class Vertice implements Serializable {

  private Object dato;
  private int codigo;

    public Vertice(Object dato, int codigo) {
        this.dato = dato;
        this.codigo = codigo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "dato=" + dato +
                ", codigo=" + codigo +
                '}';
    }
}
