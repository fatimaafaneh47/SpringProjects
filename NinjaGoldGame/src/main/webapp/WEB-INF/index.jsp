<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="title">
<label>You Gold:<label>
<input type="text" value=<c:out value="${gold}"></c:out>>
</div>
<div class="allforms">
<div class="form">
<form action="/money" method="post">
<p>farm</p>
<p>earns 10-20 Gold</p>
<input type="submit" value="Find Gold!">
<input type="hidden" value="Farm"  name="action">
</form>
</div>
<div  class="form">
<form action="/money" method="post">
<p>cave</p>
<p>earns 10-20 Gold</p>
<input type="submit" value="Find Gold!">
<input type="hidden" value="Cave"  name="action">
</form>
</div>
<div  class="form">
<form action="/money" method="post">
<p>House</p>
<p>earns 10-20 Gold</p>
<input type="submit" value="Find Gold!">
<input type="hidden" value="House"  name="action">
</form>
</div>
<div class="form">
<form action="/money" method="post">
<p>Quest</p>
<p>earns/takes 0-50 Gold</p>
<input type="submit" value="Find Gold!">
<input type="hidden" value="Quest"  name="action">
</form>
</div>
</div>
<div class="activities">
<p>Activities:</p>

<textarea rows="10" cols="150">   
<c:forEach var="oneDojo" items="${activities}">
        <c:out value="${oneDojo}"></c:out>
    </c:forEach></textarea>

</div>
</body>
</html>