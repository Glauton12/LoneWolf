<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		Tipos de envio:
		GET  ->Dados visiveis na URL
		POST ->Dados são Ocultados da URL
	 -->

	<form action="03_receber.jsp" method="post">
		<input type="text" name="nome" placeholder="informe seu nome">
		<input type="text" name="cidade" placeholder="informe sua cidade">
		<input type="submit">
	</form>

</body>
</html>