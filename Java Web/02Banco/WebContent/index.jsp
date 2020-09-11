<%@page import="dao.Acao"%>
<%@page import="beans.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP e MySql</title>

	<!-- BootStrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

	<!-- CSS -->
	<link rel="stylesheet" href="estilos.css">

	<!-- JS -->
	<script src="script.js"></script>
	
</head>
<body>
	
	<!-- Formulario -->
	<form action="cadastrar.jsp" method="post" onsubmit="return valida()">
		<div class="alert alert-danger" id="mensagem"></div>
		<input type="text" placeholder="Nome" class="form-control" name="nome" id="nome">
		<input type="text" placeholder="Idade" class="form-control" name="idade" id="idade">
		<select class="form-control" name="cidade" id="cidade">
			<option>Cidade</option>
			<option>Blumenau</option>
			<option>Florianópolis</option>
			<option>Indaial</option>
			<option>Joinville</option>
			<option>Timbó</option>
		</select>
		<input type="submit" value="Cadastrar" class="btn btn-primary">	
	</form>
	
	<!-- Tabela -->
	
	<table class="table">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Idade</th>
				<th>Cidade</th>
				<th>Remover</th>
			</tr>
		</thead>
		<tbody>
		
			<%
				//Obter usuarios
				ArrayList <Usuario> dados = Acao.listar();
			
				//laço
				for(int i = 0; i < dados.size(); i++){
				
			%>
		
			<tr>
				<td><% out.print(dados.get(i).getNome()); %></td>
				<td><% out.print(dados.get(i).getIdade());%></td>
				<td><% out.print(dados.get(i).getCidade());%></td>
				<td><a href="remover.jsp?id=<% out.print(dados.get(i).getId()); %>" class="btn btn-danger">Excluir</a></td>
			</tr>
			<% } %>
			
		</tbody>	
	</table>

</body>
</html>