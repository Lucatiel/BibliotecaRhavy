<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="Login.do" method = "post">
			<h3>Administrador<h3><br>
			<h4>Nome:<h4> <input type="text" name="nomeAdmin"><br>
			<h4>Senha:<h4> <input type="password" name="senhaAdmin">
			<input type="submit" name="botão-admin" value="OK"> <br>
		</form>
		<form action="/Consulta.do" method = "post">
			<h3> Usuário <h3> 
			<input type="submit" name="botão-usuário" value="OK" > <br>
		</form>
	</body>
</html>