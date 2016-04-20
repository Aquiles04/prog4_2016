package br.silveiraalexand.bsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.silveiraalexand.bsi.ModelView.ClienteModelView;
import br.silveiraalexand.bsi.model.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value="/cliente/novo", method=RequestMethod.POST)
	public String cadastrar(ClienteModelView clientemv, BindingResult bindingResult)
	{
		clienteService.cadastrar(clientemv.getCliente());
		return "redirect:/cliente/novo-sucesso";
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
