package crud.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.springboot.model.CursoGraduacao;

public interface CursoGraduacaoRepository extends JpaRepository<CursoGraduacao, Integer> {
	Optional<List<CursoGraduacao>> findByDescripcion(String descripcion);
}
