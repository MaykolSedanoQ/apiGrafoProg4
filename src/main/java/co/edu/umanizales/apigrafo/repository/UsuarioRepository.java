package co.edu.umanizales.apigrafo.repository;

import co.edu.umanizales.apigrafo.domain.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("SELECT usuario FROM Usuario usuario WHERE usuario.correo=?1")
    Usuario findUsuarioByCorreo(String correo);
}
