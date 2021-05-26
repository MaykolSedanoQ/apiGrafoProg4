package co.edu.umanizales.apigrafo.service;

import co.edu.umanizales.apigrafo.domain.model.Estudiante;
import co.edu.umanizales.apigrafo.domain.model.Universidad;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


import java.util.ArrayList;
import java.util.List;


@Component
public class EstudiantService {

    private List<Estudiante> listado;

    public EstudiantService() {

        listado = new ArrayList<>();

        listado.add(new Estudiante( "82201917563","Maykoll Sedano", Universidad.UMANIZALES));
        listado.add(new Estudiante( "82207563","Sebastian Cañon", Universidad.UMANIZALES));
        listado.add(new Estudiante( "82201963546","Ricardo Duque", Universidad.UMANIZALES));
        listado.add(new Estudiante( "8220756365","Laura Vaneesa Renteria ", Universidad.UMANIZALES));
    }


    public List<Estudiante> getListado() {
        return listado;
    }

    public void setListado(List<Estudiante> listado) {
        this.listado = listado;
    }


    public List<Estudiante> adicionarEstudiante(Estudiante estu){

        listado.add(estu);
        return listado;
    }
}
