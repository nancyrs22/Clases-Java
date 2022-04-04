<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recibo</title>
</head>
<body>
	<h1>
		Customer Name: 
		<c:out value="${nombre}" />
	</h1>
	<br>
	<h2>Item Name:
		<c:out value="${item}"/>
	</h2>
	<br>
	<h2>Price:
		<c:out value="${precio}"/>
	</h2>
	<br>
	<h2>Description:
		<c:out value="${descripcion}"/>
	</h2>
	<br>
	<h2>Vendor:
		<c:out value="${vendor}"/>
	</h2>
</body>
</html>