<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<h1 class="title">Send an Omikuji!</h1>
<div class="form">

<form action="enterdata",method="post">
<p>Pick any number from 5 to 25</p>
<input type="number" name="number">
<p>Enter the name of any city</p>
<input type="text" name="city">
<p>Enter the name of real person </p>
<input type="text" name="name">
<p>Enter professional endeaver or hoppy</p>
<input type="text" name="job">
<p>Enter any type of living thing</p>
<input type="text" name="living">
<p>say something nice to someone:</p>
<textarea rows="10" cols="30" name="description"></textarea>
<p>	Send and show a friend</p>
<button type="submit">send</button>
</div>
</form>
</body>
</html>