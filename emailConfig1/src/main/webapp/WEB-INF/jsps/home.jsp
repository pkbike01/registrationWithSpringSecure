<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here....</title>
</head>
<body>
	<h1>Register Here...</h1>
	<hr>


	<form action="save" method="post">
	
		Name : <input type="text" name="userName">
		Email : <input type="email" name="email">
		<input type="submit" value="save">
	</form>
	
	${msg }<br>
	
	
	

</body>
</html>