<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo Ninja</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<h1>Nuevo Ninja</h1>
	<form:form action="/ninjas/create" method="post" modelAttribute="ninja">
	
	<div class="form-group">
		<form:label path="escuela">Dojo:</form:label>
		<form:select path="escuela" class="form-control">
			<c:forEach var="dojo" items="${dojos}">
				<option value="${dojo.id}">${dojo.name}</option>
			</c:forEach>
		</form:select>
		<form:errors path="escuela" class="text-danger"/>
	</div>
	
	<div class="form-group">
		<form:label path="first_name">First name:</form:label>
		<form:input path="first_name" class="form-control"/>
		<form:errors path="first_name"/>
	</div>
	
	<div class="form-group">
		<form:label path="last_name">Last:</form:label>
		<form:input path="last_name" class="form-control"/>
		<form:errors path="last_name"/>
	</div>
	
	<div class="form-group">
		<form:label path="age">Age:</form:label>
		<form:input type= "number" path="age" class="form-control"/>
		<form:errors path="age"/>
	</div>
	
	<input type="submit" value="Crear Ninja" class="btn btn-success">
	</form:form>
</body>
</html>