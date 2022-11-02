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
<h1 class="showtitle">Heres Your Omikuji!</h1>
<div class="show">
<p>In <c:out value="${number}"></c:out> years you will live in  <c:out value="${city}"></c:out> with <c:out value="${name}"></c:out> as your rommate ,
<c:out value="${job}"></c:out> for a living. The next time you see a <c:out value="${living}"></c:out> ,you will have good luck.
<c:out value="${description}"></c:out> <p>
</div>
<div class="link">
<a href="/">Go Back</a>
</div>

</body>
</html>