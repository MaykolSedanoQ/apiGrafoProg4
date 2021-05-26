package co.edu.umanizales.apigrafo.controller;


import co.edu.umanizales.apigrafo.domain.entities.TipoUsuario;
import co.edu.umanizales.apigrafo.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path =  "grafociudades/tipousuario")
@Validated
public class TipoUsuarioController {

    private TipoUsuarioService tipoUsuarioService;

   @Autowired
    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping
    public Iterable<TipoUsuario> getAllTipoUsuarios(){
       return tipoUsuarioService.getAllTipoUsuarios();
    }

    @GetMapping ("/{id}")
    public TipoUsuario getTipoUsuarioById(@PathVariable("id") int id){
        return tipoUsuarioService.getTipoUsuarioById(id);
    }

    @PostMapping
    public TipoUsuario saveTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
       return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }

}
