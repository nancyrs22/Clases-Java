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
		<h1><c:out value="${libro.title}" /> </h1>
		<p><c:out value="${libro.postedBy}"/> read <c:out value="${libro.title}" /> by <c:out value="${libro.author}" /></p>
		<p>Here are <c:out value="${libro.postedBy}"/>'s thoughts:</p>
		<p><c:out value="${libro.thoughts}" /></p>
		<a href="/edit/${libro.getId() }" class="btn btn-warning">Editar</a>
	</div>
</body>
</html>