package br.silveiraalexand.bsi.ModelView;

import br.silveiraalexand.bsi.model.Cliente;

public class ClienteModelView {

	private Cliente cliente;
	private String confirmacaoSenha;
	
	public String getConfirmacaoSenha(){
		return confirmacaoSenha;
	}
	
	public void setConfirmacaoSenha(String confirmacaoSenha){
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
