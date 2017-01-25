<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./CrCriarItemVenda" method= "post">
		<h1>Criar ItemVenda</h1>
	 	Quantidade
	 	<br><input type = "text" name ="quantidade">
	 	<br>
	 	Id de Mobilia
	 	<br><input type = "text" name ="idMobilia">
	 	<br>
	 	Id de Ambiente
	 	<br><input type = "text" name ="idAmbiente">
	 	<br>
	 	<input type = "submit" value ="enviar">
	 </form>

</body>
</html>