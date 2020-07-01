<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio - Login</title>
</head>
<body>

	<form action="controllerLogin" method="post">
		<label for="usuario">Ingrese usuario</label><br>
		<input type="text" name="usuario" id="usuario"><br><br>
		<label for="pass">Ingrese contraseña</label><br>
		<input type="password" name="pass" id="pass"><br><br>
		
		<input type="submit" value="enviar">
	</form>

</body>
</html>