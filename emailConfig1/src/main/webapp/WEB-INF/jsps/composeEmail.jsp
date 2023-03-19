<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="composeEmail" method="post">
		<pre>
			To : <input type="text" name="to" value="${email}">
			sub : <input type="text" name="sub" >
			Compose:
				<textarea  name="emailBody" rows="20" cols="50"></textarea>
			<input type="submit" value="send">
		
		</pre>
		
	</form>

</body>
</html>