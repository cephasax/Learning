package crud.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.exception.CrudException;
import crud.springboot.model.Aluno;
import crud.springboot.model.CursoGraduacao;
import crud.springboot.repository.AlunoRepository;

@Service
public class AlunoService extends GenericService<Aluno, Integer> {

	@Autowired
	private AlunoRepository alunoRepo;
	
	@Override
	protected boolean validate(Aluno obj) {
		// TODO Auto-generated method stub
		return true;
	}

	public List<Aluno> findByNombre(String nombre) throws CrudException {
		Optional<List<Aluno>> alunos = alunoRepo.findByNombre(nombre);

		if (alunos.isPresent()) {
			return alunos.get();
		} else {
			throw new CrudException("Não foram encontrados registros");
		}
	}
	
	public void addAll(List<Aluno> alunos) {
		alunoRepo.saveAll(alunos);
	}
	
	public List<Aluno> findByCursoGraduacao(CursoGraduacao cursoGraduacao) throws CrudException {
		Optional<List<Aluno>> alunos = alunoRepo.findByCursoGraduacao(cursoGraduacao);

		if (alunos.isPresent()) {
			return alunos.get();
		} else {
			throw new CrudException("Não foram encontrados registros");
		}
	}
}
