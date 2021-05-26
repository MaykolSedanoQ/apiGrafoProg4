package co.edu.umanizales.apigrafo.controller;


import co.edu.umanizales.apigrafo.domain.entities.Arista;
import co.edu.umanizales.apigrafo.service.AristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path =  "grafociudades/arista")
@Validated
public class AristaController {

    private AristaService aristaService;

    @Autowired
   public AristaController(AristaService aristaService) {
       this.aristaService = aristaService;
   }

    @GetMapping
    public Iterable<Arista> getAllArista(){
        return aristaService.getAllArista();
    }

    @PostMapping
    public Arista saveArista(@RequestBody Arista arista){
        return aristaService.saveArista(arista);
    }

}
