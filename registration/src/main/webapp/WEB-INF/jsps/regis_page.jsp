<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Home Page...</h1>
	<hr>
	<h2>Welcome To My Page....</h2>
	<h1>Register Here!</h1>
	<form action="register" method="post">
		userName : <input type= "text" name="userName">
		Email : <input type="email" name="email">
		Password : <input type = "text" name = "password">
		<input type="submit" value= "register">
	</form>
	${msg } <br>
	<a href="users">LogIn</a>

	



</body>
</html>