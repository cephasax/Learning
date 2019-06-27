package crud.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import crud.springboot.model.Aluno;
import crud.springboot.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {
	Optional<Estudante> findByMatricula(String matricula);
	Optional<List<Estudante>> findByNombre(String nombre);
}
