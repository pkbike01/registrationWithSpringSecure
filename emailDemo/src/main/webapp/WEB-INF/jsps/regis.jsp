<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register || Here....</title>
</head>
<body>
	<a href="listAll">All Users</a>
	<form action="save" method ="post">
		Name: <input type="text" name="name">
		Email : <input type="email" name ="email">
		<input type="submit" value="save">
	
	</form>
	
	${msg }
</body>
</html>