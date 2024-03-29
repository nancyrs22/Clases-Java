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
	<h1>Bienvenido <c:out value="${user_session.getName()}"/></h1>
	<p>This is your dashboard. Nothing to see here yet</p>
	<a href="/logout">Cerrar sesion</a>
	<a href="/new" class="btn btn-primary">Agregar libros</a>
	
 	<table class="table table-hover">
		<thead>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Autor</th>
				<th>Publicado por</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="libro" items="${libros}">
				<tr>
				<td><c:out value="${libro.getId()}"/></td>
				<td><a href="/show/${libro.getId()}"><c:out value="${libro.getTitle()}"/></a></td>
				<td><c:out value="${libro.getAuthor()}"/></td>
				<td><c:out value="${libro.getPosted_by().getName()}"/></td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>

</body>
</html>