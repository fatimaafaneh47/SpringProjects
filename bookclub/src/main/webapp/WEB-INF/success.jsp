<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h2 class="welcome">Welcome ,<c:out value="${currentUser.userName}"/></h2>
<p>books from everyones shelves:</p>
<div class="link">
<a href="/logout">logout</a>
<br>
<a href="/books/new">+ Add a to my shelf!</a>
</div>
<table style="width:70%;" class="table table-striped table-bordered ">
<thead>
<tr>

			<th>ID</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Posted By</th>
</tr>
    </thead>
     <tbody>
			<c:forEach var="book" items="${books}">
 				<tr>
 				<td><c:out value="${book.id}"/></td>
				<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
				<td><c:out value="${book.authorname}"/></td>
				<td><c:out value="${book.user.userName}"/></td>
			</tr>
		</c:forEach>
		</tbody>
    </table>
</body>
</html>