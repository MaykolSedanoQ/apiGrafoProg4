package co.edu.umanizales.apigrafo.domain.model;

import java.io.Serializable;

public class Materia  implements Serializable {

    private String nombreMateria;
    private String codigo;
    private String docente;

    public Materia(String nombreMateria, String codigo, String docente) {
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.docente = docente;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombreMateria='" + nombreMateria + '\'' +
                ", codigo='" + codigo + '\'' +
                ", docente='" + docente + '\'' +
                '}';
    }
}
