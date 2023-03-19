<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User.....</title>
</head>
<body>
	<h1>Register Here....</h1>
	<form action="saveUser" method="post">
		First Name : <input type = "text"  name="firstName">
		Last Name : <input type="text" name="lastName">
		Email : <input type="email"  name="email">
		<input type="submit" value="save">
	</form>
	
	
	<form action="composeEmail" method="post">
		<input type="hidden" name="email" value="${user.email }"/>
		<input type="submit" value="send email"/>
	</form>

</body>
</html>