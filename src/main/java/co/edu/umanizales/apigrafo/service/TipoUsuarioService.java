package co.edu.umanizales.apigrafo.service;

import co.edu.umanizales.apigrafo.domain.entities.TipoUsuario;
import co.edu.umanizales.apigrafo.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class TipoUsuarioService implements Serializable {

    private TipoUsuarioRepository tipousuarioRepository;


    @Autowired //inyeccion de dependencias
    public TipoUsuarioService(TipoUsuarioRepository tipousuarioRepository) {
        this.tipousuarioRepository = tipousuarioRepository;
    }


    //Metodo que permite obtener todos los registros de la tabla y retornar un iterrable
    public  Iterable<TipoUsuario> getAllTipoUsuarios(){

        return tipousuarioRepository.findAll();
    }


    public TipoUsuario getTipoUsuarioById(int id){

        return tipousuarioRepository.findById(id).get();
    }

    public TipoUsuario saveTipoUsuario(TipoUsuario tipoUsuario){
        tipousuarioRepository.save(tipoUsuario);
        return tipoUsuario;
    }

}
