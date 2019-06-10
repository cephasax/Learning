package crud.springboot.service;

import org.springframework.stereotype.Service;

import crud.springboot.model.Usuario;

@Service
public class UsuarioService extends GenericService<Usuario, Integer> {
		
	public UsuarioService() {
	}

	@Override
	protected boolean validate(Usuario obj) {
		return true;
	}

}
