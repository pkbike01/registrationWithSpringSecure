<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List || All Users......</title>
</head>
<body>
	<h1>All Users</h1>
	<hr>
	<table border='1'>
		<tr>
			<th>user_id</th>
			<th>user_first_name</th>
			<th>user_last_name</th>
			<th>user_email</th>
			<th>user_mobile</th>
			
		</tr>
		<c:forEach var="user" items = "${users }">
		<tr>
			<td>${user.userId }</td>
			<td>${user.firstName }</td>
			<td>${user.lastName }</td>
			<td>${user.mobile }</td>
			<td><a href="findUserByuserId?userId=${user.userId }">${user.email }</a></td>
		</tr>
		</c:forEach>	
	
	</table>

</body>
</html>