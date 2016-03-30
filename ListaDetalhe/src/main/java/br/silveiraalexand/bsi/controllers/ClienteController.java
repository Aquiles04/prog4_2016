package br.silveiraalexand.bsi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.silveiraalexand.bsi.model.ClienteModelView;

@Controller
public class ClienteController {

	@RequestMapping(value ="/cliente/novo", method=RequestMethod.GET)
	
	public String novo(Model model){
		model.addAttribute("clientemv",new ClienteModelView());
		return "cliente-novo";
	}
	
}
