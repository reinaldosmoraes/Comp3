<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="./CrCriarAmbiente" method= "post">
		<h1>Criar Ambiente</h1>
	 	Numero de paredes
	 	<br><input type = "text" name ="numParedes">
	 	<br>
	 	Numero de portas
	 	<br><input type = "text" name ="numPortas">
	 	<br>
	 	Metragem
	 	<br><input type = "text" name ="metragem">
	 	<br>
	 	Id de Contrato
	 	<br><input type = "text" name ="idContrato">
	 	<br>
	 	<input type = "submit" value ="enviar">
	 </form>

</body>
</html>