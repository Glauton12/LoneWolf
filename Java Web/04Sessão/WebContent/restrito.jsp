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
		//Exibindo o valor da sessão
		out.print(session.getAttribute("nome"));
	
		//Validação
		if(session.getAttribute("nome")== null){
			response.sendRedirect("index.jsp");
		}
	%>
	
	
	<h1>Acesso Restrito</h1>
</body>
</html>