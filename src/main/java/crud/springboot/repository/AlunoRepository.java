package crud.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import crud.springboot.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	Optional<Aluno> findByMatricula(String matricula);
	Optional<List<Aluno>> findByNombre(String nombre);
}
