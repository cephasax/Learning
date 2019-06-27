package crud.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.exception.CrudException;
import crud.springboot.model.Estudante;
import crud.springboot.repository.EstudanteRepository;

@Service
public class EstudanteService extends GenericService<Estudante, Integer> {
	
	@Autowired
	private EstudanteRepository estudanteRepo;
	
	@Override
	protected boolean validate(Estudante obj) {
		// TODO Auto-generated method stub
		return true;
	}

	public List<Estudante> findByNombre(String nombre) throws CrudException {
		Optional<List<Estudante>> estudantes = estudanteRepo.findByNombre(nombre);

		if (estudantes.isPresent()) {
			return estudantes.get();
		} else {
			throw new CrudException("Não foram encontrados registros");
		}
	}
	
	public void addAll(List<Estudante> estudantes) {
		estudanteRepo.saveAll(estudantes);
	}
	
	/*
	 * public Estudante findByMatricula(String matricula) throws CrudException {
	 * Optional<Estudante> a = estudanteRepo.findByMatricula(matricula); if(a.isPresent()) {
	 * return a.get(); } else { throw new
	 * CrudException("Não foram encontrados registros"); } }
	 */
}
