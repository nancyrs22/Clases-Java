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
		<h1><c:out value/="${usuario.first_name}"/> <c:out value/="${usuario.last_name}"/></h1>
		<p>
			E-mail: <c:out value="${usuario.email}"/>
		</p>
		<p>
			Direccion: <c:out value="${usuario.direccion.getStreet()}"/>
			<c:out value="${usuario.direccion.getNumber()}"/>
			<c:out value="${usuario.direccion.getCity()}"/>
			<c:out value="${usuario.direccion.getCp()}"/>
			<c:out value="${usuario.direccion.getCountry()}"/>
		</p>
	</div>
</body>
</html>