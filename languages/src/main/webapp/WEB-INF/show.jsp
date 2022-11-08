<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/languages">Dashboard</a>
<p><c:out value="${language.name}"></c:out></p>
<p><c:out value="${language.creator}"></c:out></p>
<p><c:out value="${language.currentVersion}"></c:out></p>
<td><a href="/languages/edit/${language.id}">Edit
<td><a href="/languages/${language.id}/delete">Delete</a></td>
</body>
</html>