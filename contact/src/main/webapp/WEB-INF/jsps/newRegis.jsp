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
	<form action="save" mthod="post">
	
	
		Contact Name <input type="text" name="contactName">
		Email <input type="email" name="email">
		Mobile <input type="text" name="mobile">
		UserId <input type="number" name="userId">
		<input type="submit" value="save">
		<br>
	
		${msg }<br>
	
	</form>
	

</body>
</html>