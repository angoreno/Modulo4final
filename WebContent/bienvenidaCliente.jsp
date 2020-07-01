<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Portal Cliente</title>
</head>
<body>

<h1>Bienvenido Cliente</h1>
	
	<p>opciones a realizar con su cuenta</p>
	
	<button onclick="window.location.href='reporteAccidente.jsp'">Ingresar Reporte de accidente</button><br>
	<form action="ControllerCliente" method="get">
		<button>Listar Reportes de Accidentes</button><br>
	</form>
	
	<button>Opcion 3</button><br>
	<button>Opcion 4</button><br>

</body>
</html>