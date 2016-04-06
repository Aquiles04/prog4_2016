<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOJA - CADASTRO DO CLIENTE</title>
<style>
label, input [type=submit]{
	display:block
}
</style>
</head>
<body>

	<form:form modelAttribute="clientemv">
		<form:label path="cliente.nome">Nome:</form:label>
		<form:input path="cliente.nome"/>
		
		<form:label path="cliente.nome">Cpf:</form:label>
		<form:input path="cliente.cpf"/>
		
		<form:label path="cliente.dataNascimento">Data de Nasc.:</form:label>
		<form:input path="cliente.dataNascimento" type="date"/>
		
		<form:label path="cliente.sexo">Sexo:</form:label>
		<form:select path="cliente.sexo">
			<form:option value="M">Masculino</form:option>
			<form:option value="F">Feminino</form:option>
		</form:select>
		
		<form:label path="cliente.senha">Senha:</form:label>
		<form:password path="cliente.senha"/>
		
		<form:label path="confirmacaoSenha">Confirme sua senha:</form:label>
		<form:password path="confirmacaoSenha" />
		
		<form:label path="cliente.receberOfertaPorEmail">Deseja Receber Ofertas por e-mail fera?</form:label>
		
		<form:checkbox path="cliente.receberOfertaPorEmail" value="cliente.receberOfertaPorEmail"/>
		
		<input type="submit" value="salvar"/>
	</form:form>	
</body>
</html>