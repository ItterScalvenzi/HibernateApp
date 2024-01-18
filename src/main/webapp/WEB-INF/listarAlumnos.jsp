<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Listado de Alumnos</title>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
		<h1>Listar Alumnos</h1>
		
		<br/>
		<br/>
		<div>
			<table class="w3-table-all w3-hoverable">
			<tr class="w3-light-blue">
				<th>Alumno ID</th>
				<th>Nombre</th>
				<th>Domicilio</th>
				<th>Email</th>
				<th>Telefono</th>
			</tr>
			<c:forEach var="alumno" items="${alumnos }">
				<tr>
					<td>
						<a href="${pageContext.request.contextPath }
						/ServletModificar?idAlumno=${alumno.idAlumno }">
						${alumno.idAlumno }
						</a>
					</td>
					<td>${alumno.nombre } ${alumno.apellido }</td>
					<td>${alumno.domicilio.calle } ${alumno.domicilio.noCalle },
					${alumno.domicilio.ciudad }, ${alumno.domicilio.pais }</td>
					<td>${alumno.contacto.email }</td>
					<td>${alumno.contacto.telefono }</td>
				</tr>
			</c:forEach>
		</table>
		</div>
		
		<div class="w3-display-middle w3-margin-top w3-center">
			<a class="w3-btn w3-cyan w3-hover-teal w3-round-xxlarge"
			 href="${pageContext.request.contextPath }/ServletRedireccionar">Agregar Alumno</a>
		</div>
		
	</body>
</html>