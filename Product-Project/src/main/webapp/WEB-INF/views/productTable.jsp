<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>View</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td><a href="/editProduct/${product.id}">Edit</a></td>
            <td><a href="/deleteProduct/${product.id}">Delete</a></td>
            <td><a href="/viewProduct/${product.id}">View</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>