package crud.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import crud.springboot.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
