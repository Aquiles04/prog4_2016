package br.silveiraalexand.bsi.model;

import java.util.List;

public interface ProdutoManager {

	List<Produto> obterTodos();
	Produto obterPorId(long id);

}
