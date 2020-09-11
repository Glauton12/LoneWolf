<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada</title>
</head>
<body>
	<form action="">
		<input type="number" name="numero" placeholder="informe um número">
		<input type="submit"> 
	</form>
	
	<%
		//try
		try{
			
			//Obter numero
			int numero = Integer.parseInt(request.getParameter("numero"));
			
			//Tabuada
			for(int indice=0; indice<11; indice++){
				out.print("<p>"+numero+" X "+indice+" = "+(numero*indice)+"<p>");
			}
	
		}catch(Exception erro){}
	%>


</body>
</html>