package co.edu.umanizales.apigrafo.controller;


import co.edu.umanizales.apigrafo.domain.model.Profesor;
import co.edu.umanizales.apigrafo.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/profesor")
@Validated
public class ProfesorController {

    private ProfesorService profesorService;

    @Autowired
    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    public List<Profesor> obtenerProfesor(){
        return profesorService.getListaProfesores();
    }

    @PostMapping
    public List<Profesor> adicionarProfesor(@RequestBody Profesor profesor){
        return profesorService.adicionarProfesor(profesor);
    }
}
