<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	 	
	<link rel="stylesheet" type="text/css" href="semantic/semantic.min.css"> 	
	<script src="semantic/semantic.min.js"></script>
	<title>Insert title here</title>
</head>
<body>


 	<h1>Criar Cozinha</h1>
 	<br>
	<form class="ui form" action="./CrCriarCozinha" method= "post">
  		<div class="field">
    		<label><h3>Descrição</h3></label>
    		<input type="text" name="descricao" placeholder="Descrição">
  		</div>
 		
 		<!-- <button class="ui button"  value ="enviar">Submit</button>  -->
 		
 		<div class="ui buttons">
			<button class="ui button"><a href="http://localhost:8080/Comp3/frCozinha.jsp" target="iframe" style="color: #2F4F4F">Cancelar</a></button>
  			<div class="or" data-text="ou"></div>
  			<button type="submit" class="ui positive button">Salvar</button>
		</div>
 		
	</form>
	
</body>
</html>