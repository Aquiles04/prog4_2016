package br.silveiraalexand.bsi.model;

import java.util.List;

public interface ProdutoRepository {

	List<Produto> obterTodos();
	Produto obterPorId(long id);
	List<Produto> obterPorCategoria(long id);

}
