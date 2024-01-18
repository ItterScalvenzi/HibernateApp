<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Agregar Alumno</title>
	</head>
	<body>
		<h1>Agregar Alumno</h1>
		<form name="form1" action="${pageContext.request.contextPath }/ServletAgregar" method="post">
			Nombre: <input type="text" name="nombre"/>
			<br/>
			Apellido: <input type="text" name="apellido"/>
			<br/>
			<br/>
			Datos Domicilio
			<br/>
			Calle: <input type="text" name="calle"/>
			<br/>
			No. calle: <input type="text" name="noCalle"/>
			<br/>
			Ciudad: <input type="text" name="ciudad"/>
			<br/>
			Pais: <input type="text" name="pais"/>
			<br/>
			<br/>
			Datos Contacto
			<br/>
			Email: <input type="email" name="email"/>
			<br/>
			Teléfono: <input type="tel" name="telefono"/>
			<br/>
			<input type="submit" name="Agregar" value="Agregar"/>
		</form>
	</body>
</html>