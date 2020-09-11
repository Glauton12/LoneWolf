<%@page import="dao.Acao"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="conexao.Conexao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//Obter id
	int id = Integer.parseInt(request.getParameter("id"));
	
	//Remover
	Acao.remover(id);
	
	//Redirecionamento
	response.sendRedirect("index.jsp");
%>