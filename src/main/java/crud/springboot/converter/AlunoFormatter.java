package crud.springboot.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import crud.springboot.exception.CrudException;
import crud.springboot.model.Aluno;
import crud.springboot.service.AlunoService;

@Component
public class AlunoFormatter implements Formatter<Aluno> {
	
	@Autowired
	private AlunoService alunoService;	
	
	public AlunoFormatter(AlunoService alunoService) {
		super();
		this.alunoService = alunoService;
	}

	@Override
	public String print(Aluno object, Locale locale) {
		return (object != null ? object.toString() : "");
	}

	@Override
	public Aluno parse(String text, Locale locale) throws ParseException {
		final int id = Integer.valueOf(text);
		try {
			return alunoService.findById(id);
		} catch (CrudException e) {
			e.printStackTrace();
			return new Aluno();
		}
	}
}
