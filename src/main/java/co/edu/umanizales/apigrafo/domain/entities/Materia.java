package co.edu.umanizales.apigrafo.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materia {
    private String nombreMateria;
    private String codigo;
    private String docente;

    @Basic
    @Column(name = "nombreMateria", nullable = false, length = 70)
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
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
    @Column(name = "docente", nullable = false, length = 70)
    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materia materia = (Materia) o;

        if (nombreMateria != null ? !nombreMateria.equals(materia.nombreMateria) : materia.nombreMateria != null)
            return false;
        if (codigo != null ? !codigo.equals(materia.codigo) : materia.codigo != null) return false;
        if (docente != null ? !docente.equals(materia.docente) : materia.docente != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombreMateria != null ? nombreMateria.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (docente != null ? docente.hashCode() : 0);
        return result;
    }
}
