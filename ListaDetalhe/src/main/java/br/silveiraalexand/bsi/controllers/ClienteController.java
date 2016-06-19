package br.silveiraalexand.bsi.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.silveiraalexand.bsi.ModelView.ClienteModelView;
import br.silveiraalexand.bsi.ModelView.ClienteModelViewValidator;
import br.silveiraalexand.bsi.model.ClienteService;

@Controller
public class ClienteController {
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new ClienteModelViewValidator());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value="/cliente/novo", method=RequestMethod.POST)
	public String cadastrar(@Valid
							@ModelAttribute("clientemv")
							ClienteModelView clientemv,
							BindingResult bindingResult)
	{
		if ( bindingResult.hasErrors()){
			return "cliente-novo";
		}
		else{
		clienteService.cadastrar(clientemv.getCliente());
		return "redirect:/cliente/novo-sucesso";
		}
		
	}
	
	@RequestMapping ("/cliente/novo-sucesso")
	public String novoSucesso(){
		return "cliente-novo-sucesso";
	}
	
	
	
	@RequestMapping(value ="/cliente/novo", method=RequestMethod.GET)
	public String novo(Model model){
		model.addAttribute("clientemv",new ClienteModelView());
		return "cliente-novo";
	}
	
}
