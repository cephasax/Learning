package crud.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import crud.springboot.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
	Optional<Aluno> findByMatricula(String matricula);
	Optional<List<Aluno>> findByNome(String nome);
}
