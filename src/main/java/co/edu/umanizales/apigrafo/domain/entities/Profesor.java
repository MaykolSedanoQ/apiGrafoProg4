package co.edu.umanizales.apigrafo.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profesor {
    private String nombre;
    private String apellido;
    private String codigo;
    private String codigoMateria;

    @Basic
    @Column(name = "nombre", nullable = false, length = 70)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido", nullable = false, length = 70)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Id
    @Column(name = "codigo", nullable = false, length = 70)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "codigoMateria", nullable = false, length = 70)
    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profesor profesor = (Profesor) o;

        if (nombre != null ? !nombre.equals(profesor.nombre) : profesor.nombre != null) return false;
        if (apellido != null ? !apellido.equals(profesor.apellido) : profesor.apellido != null) return false;
        if (codigo != null ? !codigo.equals(profesor.codigo) : profesor.codigo != null) return false;
        if (codigoMateria != null ? !codigoMateria.equals(profesor.codigoMateria) : profesor.codigoMateria != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (codigoMateria != null ? codigoMateria.hashCode() : 0);
        return result;
    }
}
