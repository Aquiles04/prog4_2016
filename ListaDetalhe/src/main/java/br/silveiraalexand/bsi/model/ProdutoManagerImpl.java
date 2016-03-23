package br.silveiraalexand.bsi.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoManagerImpl implements ProdutoManager {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> obterTodos() {
		
		return produtoRepository.obterTodos();
		
	}
	
	@Override
	public Produto obterPorId(long id){
		return produtoRepository.obterPorId(id);
		
	}
}
