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
<h1>Fruit Store</h1>
<table>
<tr>
<th>Name</th>
<th>Price</th>
</tr>
<tr>
			<c:forEach var="myitem" items="${fruits}">
 				<tr>
				<td><c:out value="${myitem.name}"/></td>
				<td><c:out value="${myitem.price}"/></td>
			</tr>
		</c:forEach>
    </table>

</body>
</html>