<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<div>
	<a href="Logout">Logout</a>
</div>
<form method="post">
<p>
	<label> usuario </label> 
	<input name="usuario" required> 
</p>
<p>
	<label>	password </label> 
	<input name="pass" type="password"required"> 
</p>
<p>
	<label>	confirmar password </label>
	<input name="confirmpass" type="password" required>
</p>
<p>
	<label> email </label> 
	<input name="mail" required>
</p>

	<button type="submit" name="registro" value="registrarse">registrar</button>

</form>
</body>
</html>