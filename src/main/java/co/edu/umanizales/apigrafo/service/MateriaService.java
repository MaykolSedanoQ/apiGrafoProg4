package co.edu.umanizales.apigrafo.service;

import co.edu.umanizales.apigrafo.domain.model.Materia;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MateriaService {

    private List<Materia> listaMaterias;

    public MateriaService (){

        listaMaterias = new ArrayList<>();
        listaMaterias.add(new Materia("Matematicas Especiales","C5505001","Jose Fernando Mejia" ));
        listaMaterias.add(new Materia("Bases De Datos 1","C5505002","Diego Samir Melo" ));
        listaMaterias.add(new Materia("Microcontroladores","C5505003","Jonathan Vallejo" ));
        listaMaterias.add(new Materia("Programacion 4","C5505004","Carlos Alberto Loaiza" ));
        listaMaterias.add(new Materia("Formacion Empresarial 1","82820715","Claudia Marcela Mejia" ));
        listaMaterias.add(new Materia("Arquitectura De Software","82820711" ,"Alcibiades Vallejo"));
        listaMaterias.add(new Materia("Ingles 2","97020250","Cristian David Palacios" ));

    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public List<Materia> adicionarMateria (Materia materia){

        listaMaterias.add(materia);
        return listaMaterias;
    }
}
