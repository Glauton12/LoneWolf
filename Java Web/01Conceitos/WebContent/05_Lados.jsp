<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quadrado</title>
</head>
<body>
	<form>
	<input type="number" name="lado1" placeholder="informe o lado 1">
	<input type="number" name="lado2" placeholder="informe o lado 2">
	<input type="number" name="lado3" placeholder="informe o lado 3">
	<input type="number" name="lado4" placeholder="informe o lado 4">
	<input type="submit">
	</form>
	
	<%
	
	try{
	
	//Obter dados
	int lado1 = Integer.parseInt(request.getParameter("lado1"));
	int lado2 = Integer.parseInt(request.getParameter("lado2"));
	int lado3 = Integer.parseInt(request.getParameter("lado3"));
	int lado4 = Integer.parseInt(request.getParameter("lado4"));
	
	if((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado4)){
		out.print("É um quadrado");
	}else{
		out.print("Não é um quadrado");
	}
	
	}catch(Exception erro){}
	
	%>

</body>
</html>