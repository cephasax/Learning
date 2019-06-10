package crud.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.exception.CrudException;
import crud.springboot.manager.MachineLearningManager;
import crud.springboot.model.Aluno;
import crud.springboot.repository.AlunoRepository;
import crud.springboot.wekautils.AlunoWekaUtils;

@Service
public class AlunoService extends GenericService<Aluno, Integer> {

	@Autowired
	private AlunoRepository alunoRepo;
	
	@Autowired
	private MachineLearningManager mlmanager;
	
	@Autowired
	private AlunoWekaUtils alunoWekaUtils;
	
	@Override
	protected boolean validate(Aluno obj) {
		// TODO Auto-generated method stub
		return true;
	}

	public List<Aluno> findByNome(String nome) throws CrudException {
		Optional<List<Aluno>> alunos = alunoRepo.findByNome(nome);

		if (alunos.isPresent()) {
			return alunos.get();
		} else {
			throw new CrudException("Não foram encontrados registros");
		}
	}
	
	public Aluno findByMatricula(String matricula) throws CrudException {
		Optional<Aluno> a = alunoRepo.findByMatricula(matricula);
		if(a.isPresent()) {
			return a.get();
		} else {
			throw new CrudException("Não foram encontrados registros");
		}
	}
}
