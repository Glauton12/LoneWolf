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
		//Obter dados 
		String nome= request.getParameter("nome");
		String cidade= request.getParameter("cidade");
		
		//exibir dados
		String Samantha;
		
		if (nome == Samantha){
			out.print("você é a mais linda, Te Amo!");
		}else{
		out.print("Boa noite "+nome+" você mora em "+cidade);
		}
	%>


</body>
</html>