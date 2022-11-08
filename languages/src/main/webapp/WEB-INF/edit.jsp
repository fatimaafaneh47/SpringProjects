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
<h1>Edit Expense</h1> <a href="/languages">Dashboard</a>
<td><a href="/languages/${language.id}/delete">Delete</a></td>
<form:form action="/languages/edit/${language.id}" method="post" modelAttribute="language">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name"> Name</form:label>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
      
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Version</form:label>
      
        <form:input path="currentVersion"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>