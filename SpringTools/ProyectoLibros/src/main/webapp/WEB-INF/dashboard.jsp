<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>Titulo</th>
				<th>Descripcion</th>
				<th>Idioma</th>
				<th>Paginas</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="libro" items="${libros}">
				<tr>
				<td><c:out value="${libro.getTitle()}"/></td>
				<td><c:out value="${libro.getDescription()}"/></td>
				<td><c:out value="${libro.getLanguage()}"/></td>
				<td><c:out value="${libro.getPages()}"/></td>
				<td>
					<form action="/delete/${libro.getId()}" method="POST">
						<input type="hidden" name="_method" value="DELETE">
						<button type="submit" class="btn btn-danger">Eliminar</button>
			<!-- 		<button type="submit" class="btn btn-warning">Actualizar</button> -->	
					</form>
					<a href="/show/${libro.getId()}" class="btn btn-warning">Ver</a>	
				</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
	<a href="/new" class="btn btn-primary">Agregar libros</a>
</body>
</html>