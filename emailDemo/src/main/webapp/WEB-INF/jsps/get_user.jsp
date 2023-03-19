<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User || Info....</title>
</head>
<body>
	Id : ${user.id }
	Name : ${user.name }
	Email : ${user.email }<br>
	
	
	<form action="composeEmail" method="post">
		<input type="hidden" name="email" value="${user.email }"/>
		<input type="submit" value="send email"/>
	</form>
	

</body>
</html>