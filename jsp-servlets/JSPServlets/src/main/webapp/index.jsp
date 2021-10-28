<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<%
	String s = "Este mensaje no es muy dinámico";
	out.println(s);
	%>

	<p>Este mensaje no es muy dinámico</p>

	<%
	out.println("Este mensaje es dinámico: " + request.getHeader("USER-AGENT"));
	%>

</body>
</html>