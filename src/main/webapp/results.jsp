<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your dog's size</title>
<!-- Mike Cordon - mrcordon@dmacc.edu
	 results.jsp
	 02/04/2024\
	 A JSP that returns the size of the dog -->
</head>
<body>
	<img src="dog-banner-image.png" alt="dogs">
	<br />
	<h4>The Dog's Size Is:</h4>
	<h2>${dog.getSize()}</h2>>
	<a href="index.jsp">Find the size of another dog</a>
	<br /><br /><br /><br />
	<img src="dog-banner-2.png" alt="more dogs">
</body>
</html>