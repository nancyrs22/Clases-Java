<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo libro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<h1>Nuevo Libro</h1>
	<form:form action="/create" method="post" modelAttribute="libro">
	
	<div class="form-group">
		<form:label path="title">Titulo:</form:label>
		<form:input path="title" class="form-control"/>
		<form:errors path="title"/>
	</div>
	
	<div class="form-group">
		<form:label path="author">Autor:</form:label>
		<form:input path="author" class="form-control"/>
		<form:errors path="author"/>
	</div>
	
	<div class="form-group">
		<form:label path="thoughts">My thoughts:</form:label>
		<form:input path="thoughts" class="form-control"/>
		<form:errors path="thoughts"/>
	</div>
	
	<div class="form-group">
		<form:label path="postedBy">My thoughts:</form:label>
		<form:input path="postedBy" class="form-control"/>
		<form:errors path="postedBy"/>
	</div>
	
	<input type="submit" value="Enviar" class="btn btn-success">
	</form:form>
</body>
</html>