<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 in Action: Menu</title>
</head>

<body>

	<!-- https://struts.apache.org/tag-developers/url-tag.html -->
	<hr>
	<ul>
		<li><a href="<s:url action='helloWorld/Name'/>">HelloWorld</a></li>
	</ul>
	<hr>
</body>

</html>
