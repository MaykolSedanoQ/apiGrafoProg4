package co.edu.umanizales.apigrafo.domain.model;

import java.io.Serializable;

public class Profesor implements Serializable {

    private String nombre;
    private String apellido;
    private String codigo;
    private String codigoMateria;

    public Profesor(String nombre, String apellido, String codigo, String codigoMateria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo='" + codigo + '\'' +
                ", codigoMateria='" + codigoMateria + '\'' +
                '}';
    }
}
