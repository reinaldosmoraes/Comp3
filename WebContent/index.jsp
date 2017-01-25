<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	 	
<link rel="stylesheet" type="text/css" href="semantic/semantic.min.css"> 	
<script src="semantic/semantic.min.js"></script>

<title>Trabalho de Comp3</title>
</head>
<body>


	<div class="ui secondary pointing menu">
  		<a class="item active" href="http://localhost:8080/Comp3/home.jsp" class="item" target="iframe">
    	Home
 		</a>
  		
  		<a href="http://localhost:8080/Comp3/frCozinha.jsp" class="item" target="iframe">
    	Cozinha
  		</a>
  
  		<a class="item" href="http://localhost:8080/Comp3/frCriarQuarto.jsp" class="item" target="iframe">
    	Quarto
  		</a>
  		
  		<a class="item" href="http://localhost:8080/Comp3/frCriarSala.jsp" class="item" target="iframe">
    	Sala
  		</a>
  
  		<a class="item" href="http://localhost:8080/Comp3/frCriarComodoComposto.jsp" class="item" target="iframe">
    	Comodo Composto
  		</a>
  		
  		<a class="item" href="http://localhost:8080/Comp3/frMobilia.jsp" class="item" target="iframe">
    	Mobília
  		</a>
  		
  		<a class="item" href="http://localhost:8080/Comp3/frCriarItemVenda.jsp" class="item" target="iframe">
    	Item Venda
  		</a>
  		
  		<a class="item" href="http://localhost:8080/Comp3/frCriarAmbiente.jsp" class="item" target="iframe">
    	Ambiente
  		</a>
  		
  		<a class="item"href="http://localhost:8080/Comp3/frCriarContrato.jsp" class="item" target="iframe">
    	Contrato
  		</a>
  		
  		<div class="right menu">
    		<a class="ui item">
      		Logout
    		</a>
  		</div>
	</div>
	
	<div align="center" class="ui segment">
  		
  		<iframe name="iframe" width=70% height=768 frameborder='0' src='http://localhost:8080/Comp3/home.jsp'></iframe>
  		
	</div>

</body>
</html>