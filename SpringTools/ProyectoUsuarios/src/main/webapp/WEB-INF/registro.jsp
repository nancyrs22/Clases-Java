<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<h1>Nuevo Usuario</h1>
	<form action = "/registroUsuario" method = "POST">
	<label for="nombre">Nombre: </label>
	<input type = "text" name="nombre"><br>
	<label for="email">Email: </label>
	<input type ="email" name="email"><br>
	<input type = "submit" value="Guardar Usuario">
	</form>
</body>
</html>