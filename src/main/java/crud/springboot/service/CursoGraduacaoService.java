package crud.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.exception.CrudException;
import crud.springboot.model.CursoGraduacao;
import crud.springboot.repository.CursoGraduacaoRepository;

@Service
public class CursoGraduacaoService extends GenericService<CursoGraduacao, Integer> {

	@Autowired
	private CursoGraduacaoRepository cusroGraduacaoRepo;
	
	@Override
	protected boolean validate(CursoGraduacao obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public List<CursoGraduacao> findByDescripcion(String descripcion) throws CrudException {
		Optional<List<CursoGraduacao>> cursos = cusroGraduacaoRepo.findByDescripcion(descripcion);

		if (cursos.isPresent()) {
			return cursos.get();
		} else {
			throw new CrudException("Não foram encontrados registros");
		}
	}
}
