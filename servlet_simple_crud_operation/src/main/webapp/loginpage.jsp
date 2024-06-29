<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	padding: 0;
	margin: 0;
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

form {
	
}
</style>
</head>
<body>
	<div>
		<form action="loginStudent" method="get">
			<label>E-mail</label><br> 
			<input type="email"placeholder="E-mail" name="email"><br> 
			<label>Password</label><br>
			<input type="password" placeholder="password" name="password"><br>
			<input type="submit" value="login">
		</form>
	</div>
</body>
</html>