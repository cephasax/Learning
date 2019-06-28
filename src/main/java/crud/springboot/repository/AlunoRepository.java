package crud.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.springboot.model.Aluno;
import crud.springboot.model.CursoGraduacao;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	Optional<List<Aluno>> findByNombre(String nombre);
	Optional<List<Aluno>> findByCursoGraduacao(CursoGraduacao cursoGraduacao);
}
