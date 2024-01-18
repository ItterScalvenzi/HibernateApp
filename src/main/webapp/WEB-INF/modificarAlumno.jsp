<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Modificar Alumno</title>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
		<div class="w3-container w3-teal">
			<h1>Modificar Alumno</h1>
		</div>
		
		<form class="w3-container" name="form1" action="${pageContext.request.contextPath }/ServletModificar" method="post">
			
			<input type="hidden" name="idAlumno" value="${alumno.idAlumno }"/>
			<label class="w3-text-teal">Nombre</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="text" name="nombre" value="${alumno.nombre }"/>
		    <label class="w3-text-teal">Apellido</label>
		    <input class="w3-input w3-border w3-round w3-light-grey" type="text" name="apellido" value="${alumno.apellido }"/>
			
			<h3 class="w3-teal">Datos Domicilio</h3>
			
			<label class="w3-text-teal">Calle</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="text" name="calle" value="${alumno.domicilio.calle }"/>
			<label class="w3-text-teal">Número de calle</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="text" name="noCalle" value="${alumno.domicilio.noCalle }"/>
			<label class="w3-text-teal">Ciudad</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="text" name="ciudad" value="${alumno.domicilio.ciudad }"/>
			<label class="w3-text-teal">Pais</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="text" name="pais" value="${alumno.domicilio.pais }"/>
			
			<h3 class="w3-teal">Datos Contacto</h3>
			
			<label class="w3-text-teal">Email</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="email" name="email" value="${alumno.contacto.email }"/>
			<label class="w3-text-teal">Teléfono</label>
			<input class="w3-input w3-border w3-round w3-light-grey" type="tel" name="telefono" value="${alumno.contacto.telefono }"/>
			<input class="w3-btn w3-blue-grey w3-margin-top" type="submit" name="Modificar" value="Modificar"/>
			<input class="w3-btn w3-blue-grey w3-margin-top" type="submit" name="Eliminar" value="Eliminar"/>
 		</form>
	</body>
</html>