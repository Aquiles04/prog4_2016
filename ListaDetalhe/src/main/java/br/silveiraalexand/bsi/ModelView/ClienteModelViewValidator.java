package br.silveiraalexand.bsi.ModelView;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.silveiraalexand.bsi.model.Cliente;

public class ClienteModelViewValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz){
		//http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html#isAssi
		return ClienteModelView.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ClienteModelView clienteModelView;
		 clienteModelView = (ClienteModelView) target;
		 
		 Cliente cliente;
		 cliente = clienteModelView.getCliente();
		 
		 if( ! clienteModelView.getConfirmacaoSenha().equals(cliente.getSenha())){
			 	
			 	ValidationUtils.rejectIfEmpty(errors, "confirmacaoSenha" , "", "A senha e a confirmação não são iguais fera");
		 }
	
	}
}
