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
	<h1><c:out value="${dojo.name}"/> Ninjas</h1>
<table style="width:70%;" class="table table-striped table-bordered ">
<thead>
<tr>
			<th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
</tr>
    </thead>
     <tbody>
			<c:forEach var="ninja" items="${dojo.ninjas}">
			<tr>
 				<td><c:out value="${ninja.firstName}"/></td>
 				<td><c:out value="${ninja.lastName}"/></td>
 				<td><c:out value="${ninja.age}"/></td>
			</tr>
			</c:forEach>
		</tbody>
    </table>

</body>
</html>