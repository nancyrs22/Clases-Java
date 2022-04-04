<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<table>
		<tbody>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="frutas" items="${listafrutas}">
			<tr>
				
					<th>
						<c:out value="${frutas.getName() }" />
					</th>
					<th>
						<c:out value="${frutas.getPrice() }" />
					</th>
				
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>