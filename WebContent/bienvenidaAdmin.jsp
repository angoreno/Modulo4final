<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Portal Administrador</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="css/modulo4.css"  type="text/css">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>
<body>

	<h1>Bienvenido Administrador</h1>
	
	<div class="caja">
		<div class="form-group">
			<p class="btn-outline-light">Opciones a realizar con la cuenta</p>
	
			<form action="Mantencioncliente" method="get">
				<button class="btn btn-outline-info">Mantenedor cliente</button><br>
			</form>
		
			<button class="btn btn-outline-info" onclick="window.location.href='modificaCliente.jsp'">Crear cliente</button><br>
			<button class="btn btn-outline-info">Opción 3</button><br>
			<button class="btn btn-outline-info">Opción 4</button><br>
		</div>
		
	</div>

</body>
</html>