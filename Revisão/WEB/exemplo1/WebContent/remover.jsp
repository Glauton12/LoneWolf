<%@page import="dao.Acao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// Obter cpf
	String cpf = request.getParameter("cpf");
	
	// Remover
	Acao.remover(cpf);
	
	// Redirecionamento
	response.sendRedirect("index.jsp");
%>