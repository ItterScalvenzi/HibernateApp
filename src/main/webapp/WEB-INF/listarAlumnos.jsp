<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Listado de Alumnos</title>
	</head>
	<body>
		<h1>Listar Alumnos</h1>
		<a href="${pageContext.request.contextPath }/ServletRedireccionar">Agregar Alumno</a>
		<br/>
		<br/>
		<table border= 1>
			<tr>
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
	</body>
</html>