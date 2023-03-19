<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Register Here...</h2>
	<hr>
	<form action="save" method="post">
	
		First Name <input type="text" name="firstName">
		Last Name <input type="text" name="lastName">
		Email <input type="text" name="email">
		Mobile <input type="text" name = "contact">
		<input type="submit" value="save">
		<br>
		${msg }<br>
	</form>

</body>
</html>