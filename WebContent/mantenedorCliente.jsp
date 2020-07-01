<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mantenedor de cliente</title>
</head>
<body>
	<h1>Mantenedor de cliente</h1>
	
	<table>
		<tr>
			<th>Nombre Empresa</th>
			<th>Rut Empresa</th>
			<th>Direccion</th>
			<th>Telefono</th>
			<th>Giro</th>
			<th>Correo</th>
			<th>Usuario</th>
			<th>Clave</th>
		</tr>
		<c:forEach var="tempClient" items="${LISTACLIENTES}">
			<tr>
			<td>${tempClient.nombre}</td>
			<td>${tempClient.rut}</td>
			<td>${tempClient.direccion}</td>
			<td>${tempClient.telefono}</td>
			<td>${tempClient.giro}</td>
			<td>${tempClient.correo}</td>
			<td>${tempClient.usuario}</td>
			<td>${tempClient.clave}</td>
		</tr>
		</c:forEach>		
	</table>

</body>
</html>