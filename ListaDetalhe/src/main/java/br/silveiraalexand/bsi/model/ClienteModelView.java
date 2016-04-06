package br.silveiraalexand.bsi.model;

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
