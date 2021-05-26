package co.edu.umanizales.apigrafo.controller;


import co.edu.umanizales.apigrafo.domain.model.Materia;
import co.edu.umanizales.apigrafo.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/materias")
@Validated
public class MateriaController {

    private MateriaService materiaService;

    @Autowired
    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    public List<Materia> obtenerMateria(){
        return materiaService.getListaMaterias();
    }

    @PostMapping
    public List<Materia> adicionarMateria(@RequestBody Materia materia){
        return materiaService.adicionarMateria(materia);
    }


}
