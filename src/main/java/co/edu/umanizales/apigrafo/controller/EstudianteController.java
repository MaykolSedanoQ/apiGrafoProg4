package co.edu.umanizales.apigrafo.controller;


import co.edu.umanizales.apigrafo.domain.model.Estudiante;
import co.edu.umanizales.apigrafo.service.EstudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudiante")
@Validated
public class EstudianteController {

    private EstudiantService estudiantService;

    @Autowired
    public EstudianteController(EstudiantService estudiantService) {
        this.estudiantService = estudiantService;
    }

    @GetMapping
    @CrossOrigin (origins = "*", methods = {RequestMethod.GET})
    public List<Estudiante> obtenerEstudiante(){
        return estudiantService.getListado();
    }

    @PostMapping
    public List<Estudiante> adicionarEstudiante(@RequestBody Estudiante estu){
        return estudiantService.adicionarEstudiante(estu);
    }
}
