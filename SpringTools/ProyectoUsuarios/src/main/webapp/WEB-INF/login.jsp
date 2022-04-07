<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<div class=container>
		<h1>Inicio de Sesion</h1>
		<form action="login" method="POST">
		<div class="form-group">
			<label for="email">E-mail</label>
			<input type="email" id="email" name="email" class="form-control">
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input type="password" id="password" name="password" class="form-control">
		</div>

		<input type="submit" value="Iniciar Sesion" class="btn btn-success">
		<div class="errors">
			<c:forEach var="mensaje" items="${error_login}">
				<p><c:out value="${mensaje}"/></p>
			</c:forEach>
		</div>
		</form>
	</div>
</body>
</html>