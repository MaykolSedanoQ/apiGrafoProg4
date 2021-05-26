package co.edu.umanizales.apigrafo.service;


import co.edu.umanizales.apigrafo.domain.entities.TipoUsuario;
import co.edu.umanizales.apigrafo.domain.entities.Usuario;
import co.edu.umanizales.apigrafo.domain.model.dto.ResponseDTO;
import co.edu.umanizales.apigrafo.domain.model.dto.RespuestasDto;
import co.edu.umanizales.apigrafo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;

@Service
public class UsuarioService implements Serializable {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public  Iterable<Usuario> getAllUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(int id){

        return usuarioRepository.findById(id).get();
    }

    public Usuario saveUsuario(Usuario usuario){

        usuarioRepository.save(usuario);
        return usuario;
    }

    public String deleteUsuario(Usuario usuario){
        usuarioRepository.delete(usuario);
        return "Usuario Eliminaddo";
    }

   // public Usuario deleteUsuarioById(int id){

    // return usuarioRepository.deleteById(id);
   //}

    public ResponseDTO autenticarUsuario(Usuario usuario)
    {
        Usuario usuarioAutenticado= usuarioRepository.findUsuarioByCorreo(usuario.getCorreo());
        if(usuarioAutenticado !=null)
        {

            if(usuarioAutenticado.getContrasenia().equals(usuario.getContrasenia()))
            {
                return new ResponseDTO(200,"Usuario válido");
            }
            else
            {
                return new ResponseDTO(404,"Datos Erróneos");
            }
        }
        else
        {
            return new ResponseDTO(404,"Datos Erróneos");
        }

    }

}
