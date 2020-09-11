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
		//Criar um cookie
		Cookie nome = new Cookie("nome", "Glauton");
		Cookie idade = new Cookie("idade", "26");
		
		//tempo
		
		nome.setMaxAge(60);
		idade.setMaxAge(60);
		
		// Salvar Cookie
		response.addCookie(nome);
		response.addCookie(idade);
		
	%>

</body>
</html>