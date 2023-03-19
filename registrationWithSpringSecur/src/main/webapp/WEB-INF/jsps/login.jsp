<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page....</title>
</head>
<body>
	<h1>registered Here....</h1>
	<form action="register" method="post">
		Name : <input type ="text" name="name">
		Email : <input type ="email" name="email">
		Password : <input type = "password" name="password">
		<input type="submit" value="register">
		
		
	
	
	</form>
	${msg }<br>

</body>
</html>