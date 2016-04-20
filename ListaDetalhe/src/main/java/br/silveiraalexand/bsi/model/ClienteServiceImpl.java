package br.silveiraalexand.bsi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.silveiraalexand.bsi.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void cadastrar(Cliente c){
		clienteRepository.inserir(c);
	}
}
