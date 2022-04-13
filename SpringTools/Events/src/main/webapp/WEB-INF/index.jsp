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
		<div class=row>
			<div class="col-6">
			<h2>Registrate</h2>
			<form:form action="/register" method="post" modelAttribute="nuevoUsuario">
				
				<div>
					<form:label path="first_name">Nombre:</form:label> <!-- los campos deben corresponder a los nobmre de los atributos -->
					<form:input path="first_name" class="form-control"/>
					<form:errors path="first_name" class="text-danger"/>
				</div>
				
				<div>
					<form:label path="last_name">Apellido:</form:label> <!-- los campos deben corresponder a los nobmre de los atributos -->
					<form:input path="last_name" class="form-control"/>
					<form:errors path="last_name" class="text-danger"/>
				</div>
				
				<div>
					<form:label path="email">Email:</form:label>
					<form:input path="email" type="email" class="form-control"/>
					<form:errors path="email" class="text-danger"/>
				</div>
				
				<div>
					<form:label path="location">Locacion:</form:label> <!-- los campos deben corresponder a los nobmre de los atributos -->
					<form:input path="location" class="form-control"/>
					<form:errors path="location" class="text-danger"/>
				</div>
				
				<!-- Aqui va a ir el selector de estados -->
				<div>
					<form:label path="state">Estados:</form:label> <!-- los campos deben corresponder a los nobmre de los atributos -->
					<form:select path="state" class="form-control">
					<c:forEach var ="state" items="${states}">
						<option value="${state}">${state}</option>
					</c:forEach>
					</form:select>
					<form:errors path="state" class="text-danger"/>
				</div>
				
				<div>
					<form:label path="password">Password:</form:label>
					<form:password path="password"  class="form-control"/>
					<form:errors path="password" class="text-danger"/>
				</div>
				
				<div>
					<form:label path="confirm">Confirmacion:</form:label>
					<form:password path="confirm" class="form-control"/>
					<form:errors path="confirm" class="text-danger"/>
				</div>
				
				
				<input type="submit" value="Registrarme" class="btn btn-primary">
				
			</form:form>
			</div>
			
			<div class="col-6">
				<h2>Inicia Sesion</h2>
				<form:form action="/login" method="post" modelAttribute="nuevoLogin">
					
					<div>
						<form:label path="email">Email:</form:label>
						<form:input path="email" type="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
					
					<div>
						<form:label path="password">Password:</form:label>
						<form:password path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					<input type="submit" value="Inicia Sesion" class="btn btn-primary">
				</form:form>
			</div>


			
		</div>
	</div>
</body>
</html>