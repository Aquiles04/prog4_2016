package br.silveiraalexand.bsi.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void cadastrar(Cliente c){
		clienteRepository.inserir(c);
	}
}
