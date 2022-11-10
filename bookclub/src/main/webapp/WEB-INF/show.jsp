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
<h1><c:out value="${Book.title}"></c:out></h1>
<a href="/books">back to the shelves</a>
<h2><c:out value="${currentUser.userName}"/> read <c:out value="${Book.title}"/> by <c:out value="${Book.authorname}"/></h2>
<p>Here are <c:out value="${currentUser.userName}"/> thoughts: <p>
<p><c:out value="${Book.thoughts}"/><p>

</body>
</html>