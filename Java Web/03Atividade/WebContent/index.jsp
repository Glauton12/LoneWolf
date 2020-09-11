<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP e MySQL</title>
</head>
<body>

	<!-- Formulario -->
	<form action="cadastrar.jsp" method="post" onsubmit="return valida()">
		<div class="alert alert-danger" id="mensagem"></div>
		<input type="text" placeholder="Nome" class="form-control" name="nome id="nome>
		<input type="text" placeholder="Marca" class="form-control" name="marca" id="marca">
		<input type="text" placeholder="Valor" class="form-control" name="valor" id="valor">
		<input type="text" placeholder="Quantidade" class="form-control" name="quantidade" id="quantidade">
		<input type="submit" value="Cadastrar" class="btn btn-primary">
		</form>
		
		<!-- Tabela -->
		
		<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Produto</th>
					<th>Marca</th>
					<th>Valor</th>
					<th>Quantidade</th>
				</tr>
			</thead>
			<tbody>
				<%
					//Obter produtos
					ArrayList <Produto> dados = Acao.listar();
				
					//laço
					for(int i = 0; i < dados.size(); i++){
						
				%>
				<tr>
					<td><% out.print(dados.get(i).getNome()); %></td>
					<td><% out.print(dados.get(i).getMarca()); %></td>
					<td><% out.print(dados.get(i).getValor()); %></td>
					<td><% out.print(dados.get(i).getQuantidade()); %></td>
					<td><a href="remover.jsp?id=<% out.print(dados.get(i).getid()); %>"class="btn btn-danger">Excluir</a></td>
				</tr>
				<% } %>
			</tbody>
		</table>
</body>
</html>