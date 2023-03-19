<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration.....</title>
</head>
<body>
	<h1>Register Here....</h1>
	<hr>
	<form action="saveUser" method="post">
		First Name : <input type="text" name = "firstName">
		Last Name : <input type= "text" name= "lastName">
		Mobile : <input type="text" name = "mobile">
		Email : <input type = "email" name = "email">
		<input type= "submit" value= "save">
	
	
	
	
	</form>
	${msg }<br>




</body>
</html>