<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pacote.Dados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP e Classes</title>
</head>
<body>

		
	<ul>
	<%
	
		//Instaciar objeto da classe Dados
		Dados d = new Dados();
	
		//Obter nomes
		ArrayList nomes = d.retorno();
		
		//Laço
		for(int indice = 0; indice<nomes.size(); indice++){
			out.print("<li>"+nomes.get(indice)+"</li>");
		}
	
	%>
	</ul>
</body>
</html>