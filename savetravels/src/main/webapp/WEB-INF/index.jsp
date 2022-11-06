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
<table style="width:70%;" class="table table-striped table-bordered ">
<thead>
<tr>

			<th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            
</tr>
    </thead>
     <tbody>
			<c:forEach var="expense" items="${expenses}">
			<tr>
 				<td><c:out value="${expense.name}"/></td>
 				<td><c:out value="${expense.vendor}"/></td>
 				<td><c:out value="${expense.amount}"/></td>
			</tr>
			</c:forEach>
		</tbody>
    </table>
	<form:form action="/expenses" method="post" modelAttribute="expense">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>     
        <form:input type="text" path="description"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
    </body>
</html>