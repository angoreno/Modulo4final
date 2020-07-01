<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reporte de Accidentes</title>
</head>
<body>

	<h1>Reporte de Accidentes</h1>
	
	<form action="ControllerCliente" method="post">
		<label for="accident">Ingresar accidente</label><br>
		<input type="text" name="accident" id="accident"><br><br>
		
		<label for="nTrabajador">Ingrese nombre del trabajador</label><br>
		<input type="text" name="nTrabajador" id="nTrabajador"><br><br>
		
		<label for="fAccident">Ingrese fecha de accidente</label><br>
		<input type="Date" name="fAccident"><br><br>
		
		<label for="detAccident">Ingrese detalle del accidente</label><br>
		<textarea rows="5" cols="30" name="detAccident" id="detAccident"></textarea><br><br>
		
		<input type="submit" Value="Enviar">
		
	</form>

</body>
</html>