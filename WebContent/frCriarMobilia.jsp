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

	<h1>Criar Mobília</h1>
 	<br>
	<form class="ui form" action="./CrCriarMobilia" method= "post">
  		<div class="field">
    		<label><h3>Descrição</h3></label>
    		<input type="text" name="descricao" placeholder="Descrição">
  		</div>
  		
  		<div><label><h3>Custo</h3></label></div>
  			<div class="ui right labeled input">
 			<div class="ui label">$</div>
  			<input type="number" placeholder="Amount" name="custo">
  			<div class="ui basic label">.00</div>
		</div>
 		<br>
 		<div class="field"><br>
    		<label><h3>Tempo de Entrega</h3></label>
    		<input type="number" name="tempoEntrega" placeholder="Tempo de entrega em semanas">
  		</div>
 		
 		<div class="field"><br>
    		<label><h3>Id de Comodo</h3></label>
    		<input type="number" name="idComodo" placeholder="id de Comodo">
  		</div>
 		
 		<div class="ui buttons">
			<button class="ui button"><a href="http://localhost:8080/Comp3/frMobilia.jsp" target="iframe" style="color: #2F4F4F">Cancelar</a></button>
  			<div class="or" data-text="ou"></div>
  			<button type="submit" class="ui positive button">Salvar</button>
		</div>
 		
	</form>
	 
</body>
</html>