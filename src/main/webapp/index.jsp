<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>How big is your dog?</title>
<!-- Mike Cordon - mrcordon@dmacc.edu
	 index.jsp
	 02/04/2024
	 A JSP home page asking for the weight of a dog -->
</head>
<body>
	<img src="dog-banner-image.png" alt="dogs">
	<br />
	<h1>How Big Is Your Dog?</h1>
	<form action="getDogSizeServlet" method="post">
	<h3>Enter your dog's weight in pounds (whole numbers only): </h3>
	<input type="text" name="dogWeight" size="5">
	<input type="submit" value="Find Size!" />
	<br /><br /><br /><br />
	<img src="dog-banner-2.png" alt="more dogs">
	</form>
</body>
</html>