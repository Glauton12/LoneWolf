<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//Criar sessão
		session.setAttribute("nome", "glauton");
	%>
	
	<a href="restrito.jsp">Clique aqui</a>
</body>
</html>