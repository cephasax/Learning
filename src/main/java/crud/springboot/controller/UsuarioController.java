package crud.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import crud.springboot.exception.CrudException;
import crud.springboot.model.Usuario;
import crud.springboot.service.UsuarioService;

@Controller
public class UsuarioController {

	private final String nameMainObj = "usuario";
	private final String nameMainListObj = "usuarios";

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "usuario/list")
	public ModelAndView list(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pages/usuario/list");
		modelAndView.addObject(nameMainListObj, usuarioService.listar());
		return modelAndView;
	}

	@GetMapping(value = "usuario/form")
	public ModelAndView form(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pages/usuario/form");

		if (!model.containsAttribute(nameMainObj)) {
			modelAndView.addObject(nameMainObj, new Usuario());
		}

		return modelAndView;
	}

	@GetMapping(value = "usuario/editar/{id}")
	public ModelAndView editar(Model model, @PathVariable int id) {
		try {
			model.addAttribute(nameMainObj, usuarioService.findById(id));
		} catch (CrudException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return form(model);
	}

	@GetMapping(value = "usuario/excluir/{id}")
	public ModelAndView excluir(Model model, @PathVariable int id) {
		usuarioService.deleteById(id);
		return list(model);
	}

	@PostMapping(value = "usuario/salvar")
	public ModelAndView salvar(Model model, @ModelAttribute(nameMainObj) Usuario usuario) {
		try {
			usuarioService.salvarOuAtualizar(usuario);
		} catch (CrudException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list(model);
	}
}
