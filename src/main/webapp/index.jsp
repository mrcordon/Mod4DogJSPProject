<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dog Information</title>
</head>
<body>
	<img src="dog-banner-image.png" alt="dogs">
	<br />
	<h1>What is your dog's name and breed</h1>
	<form action="getDogNameServlet" method="post">
		<h3>Enter your dog's name: </h3>
		<input type="text" name="dogName" size="15">
		<br />
		<h3>Enter your dog's breed</h3>
		<input type="text" name="dogBreed" size="15">
		<input type="submit" value="submit information" />
	</form>
	<br /><br /><br /><br />
	<img src="dog-banner-2.png" alt="more dogs">
</body>
</html>