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
<h1>Home Page</h1>
<a href="/products/new">New Product</a>
<a href="/categories/new">New Category</a>
<table>
		<tr>
			<td>Products</td>
			<td>Categories</td>
		</tr>
		<tr>
			<td>
			<ul>
					<c:forEach var="product" items="${products}">
						<li><a href="/products/${product.id}"><c:out value="${product.name}"></c:out></a></li>
					</c:forEach>
				</ul>
			</td>
			<td>
				<ul>
					<c:forEach var="category" items="${categories}">
					<li><a href="/categories/${category.id}"><c:out value="${category.name}"></c:out></a></li>
					</c:forEach>
					</ul>
			</td>
		</tr>
</table>
</body>
</html>