package br.silveiraalexand.bsi.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NaMemoriaClienteRepository implements ClienteRepository{
	
	private static List<Cliente> clientes = new ArrayList<>();
	
	@Override
	public void inserir(Cliente cliente){
		
		long novoId;
		
		if( clientes.size() > 0 ){
			Comparator<Cliente> cmp;
			cmp = Comparator.comparing(Cliente::getId);
			novoId = clientes.stream()
					.max(cmp)
					.get()
					.getId() + 1 ;
					
		}
		else
			novoId = 1;
		
		cliente.setId(novoId);
		clientes.add(cliente);
	}

}
