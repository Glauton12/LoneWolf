<%@page import="dao.Acao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>


<%

	//Obter dados
	String nome = request.getParameter("nome");
	String cpf = request.getParameter("cpf");
	String nascimento = request.getParameter("nascimento");
	
	//cadastrar
	Acao.cadastrar(nome, cpf, nascimento);
	
	//redirecionando
	response.sendRedirect("index.jsp");


%>