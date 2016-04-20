package br.silveiraalexand.bsi.repository;

import java.util.List;

import br.silveiraalexand.bsi.model.Produto;

public interface ProdutoRepository {

	List<Produto> obterTodos();
	Produto obterPorId(long id);
	List<Produto> obterPorCategoria(long id);

}
