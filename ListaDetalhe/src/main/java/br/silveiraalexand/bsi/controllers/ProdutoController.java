package br.silveiraalexand.bsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.silveiraalexand.bsi.model.Produto;
import br.silveiraalexand.bsi.model.ProdutoManager;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoManager produtoManager;

	@RequestMapping("/produtos")
	public String todos(@RequestParam (value="categoriaId", required=false) Long id, Model model)
	{
		if(id == null)
		{
			model.addAttribute("produtos", produtoManager.obterTodos());
		}
		else{
			model.addAttribute("produtos",produtoManager.obterPorCategoria(id));

		}
		return "produtos";
	}
	
	@RequestMapping("/detalhe/{id}")
	public String detalhe(@PathVariable("id") long id,Model model){
		
		Produto produto;
		produto = produtoManager.obterPorId(id);
		model.addAttribute("produto", produto);
		return "produto-detalhe";
	}
}
