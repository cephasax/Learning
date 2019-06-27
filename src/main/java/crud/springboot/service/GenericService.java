package crud.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import crud.springboot.exception.CrudException;

@Service
public abstract class GenericService<T, PK> {

	protected abstract boolean validate(T obj);

	@Autowired
	protected JpaRepository<T, PK> repo;
	
	public List<T> listar() {
		return (List<T>) repo.findAll();
	}

	public void salvarOuAtualizar(T obj) throws CrudException {
		if (validate(obj)) {
			repo.save(obj);
		} else {
			throw new CrudException("Não foi possível cadastrar");
		}
	}

	public void deletar(T obj) {
		repo.delete(obj);
	}
	
	public T findById(PK id) throws CrudException {
		Optional<T> obj = repo.findById(id);
		if(obj.isPresent()) {
			return obj.get();
		} else {
			throw new CrudException("Registro não encontrado");
		}
	}
	
	public void deleteById(PK id) {
		repo.deleteById(id);
	}
}
