<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Users</title>
</head>
<body>
	<table border='1'>
		
			<tr>
				<th>id</th>
				<th>name</th>
				<th>email</th>
			</tr>
			<c:forEach var="user" items="${users }">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td><a href="findUserByid?id=${user.id }">${user.email }</a></td>
				
			</tr>
			</c:forEach>
	
	</table>

</body>
</html>