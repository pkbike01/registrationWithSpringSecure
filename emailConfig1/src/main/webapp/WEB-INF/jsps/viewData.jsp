<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>your data</title>
</head>
<body>



	<pre>
	
			userId : ${user.id }
			name : ${user.userName }
			email : ${user.email }
			${msg }<br>
	
	
	</pre>
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${user.email }"/>
		<input type="submit" value="send email"/>
	</form>
	
	




</body>
</html>