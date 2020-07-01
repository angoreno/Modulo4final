<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Reportes</title>
</head>
<body>
	<table>
		<tr>
			<th>N Reporte</th>
			<th>Empresa</th>
			<th>Rut</th>
			<th>TP Accidente</th>
			<th>Nombre Trabajador</th>
			<th>Fecha</th>
			<th>Detalle</th>
			<th>Usuario</th>
		</tr>
		
		<c:forEach var="tepReport" items="${LISTAREPORTES}">
			<tr>
				<td>${tepReport.idCliente}</td>
				<td>${tepReport.nombreCliente}</td>
				<td>${tepReport.rutCliente}</td>
				<td>${tepReport.accidentCliente}</td>
				<td>${tepReport.trabajadorCliente}</td>
				<td>${tepReport.fechaCliente}</td>
				<td>${tepReport.detalleCliente}</td>
				<td>${tepReport.usuarioCliente}</td>
			</tr>
		</c:forEach>
		
	
		
		
	</table>


</body>
</html>