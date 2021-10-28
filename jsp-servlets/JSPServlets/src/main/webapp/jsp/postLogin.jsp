<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>postLogin.jsp</h1>
	<h2>Request</h2>
	<br />
	<%-- <%="usuario: " + request.getParameter("usuario") + ", contraseña: " + request.getParameter("contrasena")%> --%>
		<h2>Request</h2> <br/>
	<%="usuario: " + request.getAttribute("usuario") +
		", contraseña: " + request.getAttribute("contrasena")%>
	
	<h2>Sesion</h2> <br/>
	<%="usuario: " + session.getAttribute("usuario")
		+ ", contraseña: " + session.getAttribute("contrasena") %>
		
		
	<h2>Contexto</h2> <br/>
	<%="usuario: " + application.getAttribute("usuario")
		+ ", contraseña: " + application.getAttribute("contrasena")%>
	
</body>
</html>