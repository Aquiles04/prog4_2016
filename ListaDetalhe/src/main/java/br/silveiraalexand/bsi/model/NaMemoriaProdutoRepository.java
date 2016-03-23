package br.silveiraalexand.bsi.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaProdutoRepository implements ProdutoRepository {

	
	private static List<Produto> produtos = new ArrayList<>();
	
	static{
		produtos.add(new Produto());
		produtos.get(0).setId(1L);
		produtos.get(0).setNome("Tablete Sansungue");
		produtos.get(0).setPreco(899.00);
		
		produtos.add(new Produto());
		produtos.get(1).setId(2L);
		produtos.get(1).setNome("Iphone 5e");
		produtos.get(1).setPreco(4_500.00);
		
		produtos.add(new Produto());
		produtos.get(2).setId(3L);
		produtos.get(2).setNome("Livro Java Como Programar");
		produtos.get(2).setPreco(400.00);
	}
	
	@Override
	public List<Produto> obterTodos (){
		return produtos;
	}
	
	public Produto obterPorId(long id){

// Maneira Bizarra Usando LAMBDA
//		return produtos.stream()
//				.filter(p -> p.getId() == id)
//				.findFirst()
//				.get();
		
		for(Produto produto : produtos){
			
			if (produto.getId() == id){
				return produto;
			}
			
		}
		
		return null;
	}

}
