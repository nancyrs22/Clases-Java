<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
	
	<form action="/omikujiFormulario" method = "POST">
		<label for="number">Pick any number from 5 to 25: </label>
		<input type = "text" name="number">
		<br>
		<label for="city">Enter the name of any city: </label>
		<input type = "text" name="city">
		<br>
		<label for="name">Enter the name of any real person: </label>
		<input type = "text" name="name">
		<br>
		<label for="hobby">Enter professional endeavor or hobby: </label>
		<input type = "text" name="hobby">
		<br>
		<label for="thing">Enter any time of living thing: </label>
		<input type = "text" name="thing">
		<br>
		<label for="comment">Say something nice to someone: </label>
		<input type = "text" name="comment">
		<br>
		<p>Send and show a friend!</p>
		<br>
		<input type="submit" value="Send">
		
		<div>
		
		</div>
	</form>
</body>
</html>