<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Gestion de Alumnos</title>
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	</head>
	<body>
		<div class="w3-container w3-light-blue w3-opacity w3-right-align">
			<h1>Gestion de Alumnos</h1>
		</div>
		<div class="w3-display-container w3-content" style="max-width:1500px;">
		<img class="w3-image" src="${pageContext.request.contextPath }/img/fondoGestion.jpg" alt="TE" width="100%">
			<div class="w3-display-middle w3-margin-top w3-center">
				<a class="w3-btn w3-cyan w3-hover-teal w3-round-xxlarge" href="${pageContext.request.contextPath }/ServletControlador">Listado de Alumnos</a>
			</div>
		</div>
	</body>
</html>