<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Nuevo Libro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<h1>Nuevo Libro</h1>
	<form:form action="/create" method="POST" modelAttribute="libro">
	
	<div class="form-group">
		<form:label path="title">Titulo:</form:label>
		<form:input path="title"/>
		<form:errors path="title"/>
	</div>
	
	<div class="form-group">
		<form:label path="description">Descripcion:</form:label>
		<form:input path="description"/>
		<form:errors path="description"/>
	</div>
	
	<div class="form-group">
		<form:label path="language">Idioma:</form:label>
		<form:input path="language"/>
		<form:errors path="language"/>
	</div>
	
	<div class="form-group">
		<form:label path="pages">Paginas:</form:label>
		<form:input path="pages"/>
		<form:errors path="pages"/>
	</div>
	
	<input type="submit" value="Enviar" class="btn btn-success">
	</form:form>
</body>
</html>