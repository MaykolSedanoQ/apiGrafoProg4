package co.edu.umanizales.apigrafo.controller;


import co.edu.umanizales.apigrafo.domain.entities.Usuario;
import co.edu.umanizales.apigrafo.domain.model.dto.ResponseDTO;
import co.edu.umanizales.apigrafo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "autenticar")
@Validated
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public Iterable<Usuario> getAllUsuario(){
        return usuarioService.getAllUsuario();
    }

    @GetMapping ("/{id}")
    public Usuario getUsuarioById(@PathVariable("id") int id){
        return usuarioService.getUsuarioById(id);
    }


    //@PostMapping
   // public Usuario saveUsuario(@RequestBody Usuario usuario){
      //  return usuarioService.saveUsuario(usuario);
    //}

    @PostMapping
    @CrossOrigin(origins = "*", methods= {RequestMethod.POST})
    public ResponseDTO autenticarUsuario(@RequestBody Usuario usuario){
        return usuarioService.autenticarUsuario(usuario);
    }


    @DeleteMapping
    public  String deleteUsuario(@RequestBody Usuario usuario){
        return usuarioService.deleteUsuario(usuario);
    }

  // @DeleteMapping("/{id}")
   //public Usuario deleteUsuarioById(@PathVariable (name = "id") int id){
   //   return usuarioService.deleteUsuarioById(id);
 // }
}
