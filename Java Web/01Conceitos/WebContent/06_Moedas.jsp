<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form>
		<input type="number" name="cent01" placeholder="informe centavos 0,01">
		<input type="number" name="cent05" placeholder="informe centavos 0,05">
		<input type="number" name="cent10" placeholder="informe centavos 0,10">
		<input type="number" name="cent25" placeholder="informe centavos 0,25">
		<input type="number" name="cent50" placeholder="informe centavos 0,50">
		<input type="number" name="cent100" placeholder="informe centavos 1,00">
		<input type="submit">
	</form>
	
	<%
		try{
			
			int c01 = Integer.parseInt(request.getParameter("cent01"));
			int c05 = Integer.parseInt(request.getParameter("cent05"));
			int c10 = Integer.parseInt(request.getParameter("cent10"));
			int c25 = Integer.parseInt(request.getParameter("cent25"));
			int c50 = Integer.parseInt(request.getParameter("cent50"));
			int c100 = Integer.parseInt(request.getParameter("cent100"));
			
			//calculo
			double total = (c01*0.01) + (c05*0.05) + (c10*0.10) + (c25*0.25) + (c50*0.50) + (c100*1.00);
		
			//mendagem
			out.print("R$ "+total);
			
		}catch(Exception erro){}
	
	%>

</body>
</html>

		