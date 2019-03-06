<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false"%>
<link rel="icon"
	href="http://localhost:8080/ORS_Proj0/resources/img/Title_Icon.png">

<title>Home</title>
</head>
<body
	style="background-image: url('http://localhost:8080/ORS_Proj0/resources/img/contact-form-step1-background.jpg');">

	${message}
	<br>
	<br>
	<H1 align="center">
		<s:message code="label.welcomeToORS"></s:message>
	</H1>
</body>
</html>