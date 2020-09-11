<%@page import="dao.Acao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//Obter dados
	String nome = request.getParameter("nome");
	int idade = Integer.parseInt(request.getParameter("idade"));
	String cidade = request.getParameter("cidade");
	
	//Cadastrar
	Acao.cadastrar(nome, idade, cidade);
	
	//Redirecionamento
	response.sendRedirect("index.jsp");
	
%>