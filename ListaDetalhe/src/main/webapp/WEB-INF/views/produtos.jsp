<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> LOJA VIRTUAL </title>
</head>
<body>
	<h1>Lista de Produtos</h1>
	<h2>Porra!</h2>
	
	<ul>
	<c:forEach items="${produtos}" var="produto">
		<li><a href="detalhe/${produto.id}">${produto.nome}</a></li>
		</c:forEach>
	</ul>
	
</body>
</html>