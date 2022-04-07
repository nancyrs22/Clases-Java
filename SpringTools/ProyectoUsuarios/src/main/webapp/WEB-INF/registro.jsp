<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<h1>Nuevo Usuario</h1>
	<form:form action="/create" method="POST" modelAttribute="usuario">
	
	<div class="form-group">
		<form:label path="first_name">Nombre:</form:label>
		<form:input path="first_name"/>
		<form:errors path="first_name"/>
	</div>
	
	<div class="form-group">
		<form:label path="last_name">Apellido:</form:label>
		<form:input path="last_name"/>
		<form:errors path="last_name"/>
	</div>
	
	<div class="form-group">
		<form:label path="email">Email:</form:label>
		<form:input path="email" type="email"/>
		<form:errors path="email"/>
	</div>
	
	<div class="form-group">
		<form:label path="password">Password:</form:label>
		<form:password path="password" />
		<form:errors path="password"/>
	</div>
	
	<div>
		<form:label path="salon">Salon</form:label>
		<form:select path="salon" class="form-control">
			<c:forEach var ="s" items="${salones }">
			<form:option value="${s.id}">${s.name }</form:option>
			</c:forEach>
		</form:select>
	</div>
<!--  
	<label for="nombre">Nombre: </label>
	<input type = "text" name="nombre"><br>
	<label for="email">Email: </label>
	<input type ="email" name="email"><br>
-->	
	
	<input type = "submit" value="Enviar" class="btn btn-success">

	</form:form>
	
	<div>
		<c:forEach var="mensaje" items="${ error_registro}">
			<p><c:out value = "${mensaje}"/></p>
		</c:forEach>
	</div>
</body>
</html>