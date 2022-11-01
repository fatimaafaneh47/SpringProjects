<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Name:<c:out value="${name}"></c:out></h1>
<h2>Item Name :<c:out value="${itemName}"></c:out></h2>
<h3>Price :<c:out value="${price}"></c:out></h3>
<h4>Description :<c:out value="${description}"></c:out></h4>
<h5>Vendor:<c:out value="${vendor}"></c:out></h5>


</body>
</html>