<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio - Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="css/modulo4.css"  type="text/css">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>
<body>

	<h1>Inicio de sesión</h1>
	<div class="caja ">
	
		<form action="controllerLogin" method="post" >
			<div class="form-group">
				<label for="usuario">Ingrese usuario</label><br>
				<input type="text" name="usuario" id="usuario" class="form-control"><br><br>
				<label for="pass">Ingrese contraseña</label><br>
				<input type="password" name="pass" id="pass" class="form-control"><br><br>
			
				<input type="submit" value="Enviar" class="btn btn-info">
			</div>
		</form>
	</div>

</body>
</html>