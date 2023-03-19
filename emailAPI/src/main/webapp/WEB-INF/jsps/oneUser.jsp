<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user Data..</title>
</head>
<body>
	<h2>User Info....</h2>
	<pre>
		UserId : ${user.userId }
		First Name : ${user.firstName }
		Last Name : ${user.lastName }
		Mobile : ${user.mobile }
		Email : ${user.email }<br>
	
	</pre>
	
	<form action="composeEmail" method="post">
		<input type="hidden" name="email" value="${user.email }"/>
		<input type="submit" value="send email"/>
	</form>
	
	
	
	

</body>
</html>