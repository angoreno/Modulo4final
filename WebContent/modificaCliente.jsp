<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar Cliente</title>
</head>
<body>

	<h1>Creacion de Cliente</h1>

	<form action="Mantencioncliente" method="post">
		<label for="nombre">Nombre Empresa</label><br>
		<input type="text" name="nombre"><br><br>
		
		<label for="rut">Rut Empresa</label><br>
		<input type="text" name="rut"><br><br>
		
		<label for="direccion">Direccion Empresa</label><br>
		<input type="text" name="direccion"><br><br>
		
		<label for="telefono">Telefono Empresa</label><br>
		<input type="text" name="telefono"><br><br>
		
		<label for="giro">Giro Empresa</label><br>
		<input type="text" name="giro"><br><br>
		
		<label for="correo">Correo Empresa</label><br>
		<input type="text" name="correo"><br><br>
		
		<label for="usuario">Usuario</label><br>
		<input type="text" name="usuario"><br><br>
		
		<label for="pass">Contraseña</label><br>
		<input type="text" name="pass"><br><br>
				
		<input type="submit" Value="enviar">
	</form>

</body>
</html>