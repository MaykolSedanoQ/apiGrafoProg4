package co.edu.umanizales.apigrafo.service;

import co.edu.umanizales.apigrafo.domain.model.Profesor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProfesorService {

    private List<Profesor> listaProfesores;

    public ProfesorService (){
        listaProfesores = new ArrayList<>();
        listaProfesores.add(new Profesor("Jose Fernando","Mejia Correa",
                "82123456","C5505001"));
        listaProfesores.add(new Profesor("Diego Samir","Melo Solarte",
                "82123457","C5505002"));
        listaProfesores.add(new Profesor("Jonathan","Vallejo Cardona",
                "82123458","C5505003"));
        listaProfesores.add(new Profesor("Carlos Alberto","Loaiza Guerrero",
                "82123459","C5505004"));
        listaProfesores.add(new Profesor("Claudia Marcela","Mejia Hernandez",
                "82123451","82820715"));
        listaProfesores.add(new Profesor("Cristian David","Palacio Londoño",
                "82123452","97020250"));
        listaProfesores.add(new Profesor("Alcibiades","Vallejo Berrio",
                "82123453","82820711"));
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public List<Profesor> adicionarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
        return listaProfesores;
    }
}
