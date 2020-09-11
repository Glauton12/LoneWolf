<%@page import="dao.Acao"%>
<%@page import="beans.Clientes"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

	<!-- CSS -->
	<link rel="stylesheet" href="estilos.css">
	
	<!-- JS -->
	<script src="script.js"></script>

</head>
<body>

	<form action="cadastrar.jsp">
		<input type="text" placeholder="CPF" class="form-control" name="cpf" id="cpf">
	<input type="text" placeholder="Nome" class="form-control" name="nome" id="nome">
	<input type="text" placeholder="Nascimento" class="form-control" name="nascimento" id="nascimento">
	<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form>
	
	<!-- TABELA -->
	<table class="table">
		<thead>
			<tr>
				<th>CPF</th>
				<th>Nome</th>
				<th>Nascimento</th>
			</tr>
		</thead>
		
		<tbody>
			
		</tbody>
		
		<%
			//Obter usuarios
			ArrayList<Clientes> dados = Acao.listar();
			//Laço
			for(int i = 0; i <dados.size(); i++){
		%>
		
		<tr>
				<td><% out.print(dados.get(i).getNome()); %></td>
				<td><% out.print(dados.get(i).getCpf()); %></td>
				<td><% out.print(dados.get(i).getNascimento()); %></td>
				<td><a href="remover.jsp?cpf=<% out.print(dados.get(i).getNome()); %>" class="btn btn-danger">Excluir</a></td>
		</tr>
		
		<% } %>
	
	</table>

</body>
</html>