<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Agregar Alumno</title>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
		<h1>Agregar Alumno</h1>
		<form name="form1" action="${pageContext.request.contextPath }/ServletAgregar" method="post">
			<label>Nombre:</label> 
			<input class="w3-input w3-border w3-round" type="text" name="nombre"/>
			<label>Apellido</label>
			<input class="w3-input w3-border w3-round" type="text" name="apellido"/>
			
			<h3>Datos Domicilio</h3>
		
			<label>Calle</label>
			<input class="w3-input w3-border w3-round" type="text" name="calle"/>
			<label>Número de calle</label>
			<input class="w3-input w3-border w3-round" type="text" name="noCalle"/>
			<label>Ciudad</label>
			<input class="w3-input w3-border w3-round" type="text" name="ciudad"/>
			<label>Pais</label>
			<input class="w3-input w3-border w3-round" type="text" name="pais"/>
			
			<h3>Datos Contacto</h3>
			
			<label>Email</label>
			<input class="w3-input w3-border w3-round" type="email" name="email"/>
			<label>Teléfono</label>
			<input class="w3-input w3-border w3-round" type="tel" name="telefono"/>
			<input type="submit" name="Agregar" value="Agregar"/>
		</form>
	</body>
</html>