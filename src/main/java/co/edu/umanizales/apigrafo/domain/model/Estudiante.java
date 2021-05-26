package co.edu.umanizales.apigrafo.domain.model;


import java.io.Serializable;

public class Estudiante implements Serializable {

    private String codigo;
    private String nombre;
    private Universidad universidad;


    public Estudiante(String codigo, String nombre, Universidad universidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
