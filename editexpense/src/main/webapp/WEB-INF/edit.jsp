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
<h1>Edit Expense</h1> <a href="/expenses">Go Back</a>
<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Expense Name:</form:label>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor:</form:label>
      
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="description">Description:</form:label>
      
        <form:input path="description"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        
	    <form:input path="amount"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>