package co.edu.umanizales.apigrafo.controller;



import co.edu.umanizales.apigrafo.domain.entities.Vertice;
import co.edu.umanizales.apigrafo.service.VerticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "grafociudades/vertice")
@Validated
public class VerticeController {

    private VerticeService verticeService;

    @Autowired
    public VerticeController(VerticeService verticeService) {
      this.verticeService = verticeService;
    }

    @GetMapping("/{codigo}")
    public Vertice getVerticeByCodigo(@PathVariable("codigo") int codigo){
        return verticeService.getVerticeByCodigo(codigo);
    }

    @PostMapping
    public Vertice saveVertice(@RequestBody Vertice vertice){
        return verticeService.saveVertice(vertice);
    }

}
