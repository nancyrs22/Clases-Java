<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h2>Nuevo Dojo</h2>
		
		<form:form action="/dojos/create" method="post" modelAttribute="dojo">
		
		<div>
			<form:label path="name">Nombre:</form:label> <!-- los campos deben corresponder a los nobmre de los atributos -->
			<form:input path="name" class="form-control"/>
			<form:errors path="name" class="text-danger"/>
		</div>
		<input type="submit" value="Crear Dojo" class="btn btn-primary">
		</form:form>
		 
	</div>
	
</body>
</html>