package crud.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import crud.springboot.exception.CrudException;
import crud.springboot.manager.MachineLearningManager;
import crud.springboot.model.Aluno;
import crud.springboot.model.AlunoWeka;
import crud.springboot.model.AlunoWekaBuilder;
import crud.springboot.service.AlunoService;

@Controller
public class AlunoController {

	private final String OBJ = "aluno";
	private final String LIST_OBJ = "alunos";

	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private MachineLearningManager mlmanager;
	
	public AlunoController() {

	}

	@GetMapping(value = "aluno/list")
	public ModelAndView list(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pages/aluno/list");
		//modelAndView.addObject(LIST_OBJ, alunoService.listar());
		
		//CEPHAS
		ArrayList<Aluno> alunos = (ArrayList<Aluno>)alunoService.listar();
		ArrayList<AlunoWeka> alunosWeka = new ArrayList<AlunoWeka>();
		
		System.out.println("alunos na tabela ALUNO: " + alunos.size());
		for (Aluno aluno: alunos) {
			AlunoWeka al = new AlunoWeka();
			if(aluno.getAlunoClass().equals("EN CURSO")) {
				al = AlunoWekaBuilder.buildAlunoWeka(aluno);
				alunosWeka.add(al);
			}
		}
		System.out.println("alunosWeka na tabela ALUNO: " + alunosWeka.size());
		
		for(AlunoWeka a: alunosWeka) {
			a = mlmanager.makePredictionForAluno(a);
			System.out.println(a.toString());
		}
		
		return modelAndView;
	}

	@GetMapping(value = "aluno/form")
	public ModelAndView form(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pages/aluno/form");

		if (!model.containsAttribute(OBJ)) {
			modelAndView.addObject(OBJ, new Aluno());
		}

		return modelAndView;
	}

	@GetMapping(value = "aluno/editar/{id}")
	public ModelAndView editar(Model model, @PathVariable int id) {
		try {
			model.addAttribute(OBJ, alunoService.findById(id));
		} catch (CrudException e) {
			e.printStackTrace();
		}
		return form(model);
	}

	@GetMapping(value = "aluno/excluir/{id}")
	public ModelAndView excluir(Model model, @PathVariable int id) {
		alunoService.deleteById(id);
		return list(model);
	}

	@PostMapping(value = "aluno/salvar")
	public ModelAndView salvar(Model model, @ModelAttribute(OBJ) Aluno aluno){
		try {
			alunoService.salvarOuAtualizar(aluno);
		} catch (CrudException e) {
			e.printStackTrace();
		}
		return list(model);
	}
}
