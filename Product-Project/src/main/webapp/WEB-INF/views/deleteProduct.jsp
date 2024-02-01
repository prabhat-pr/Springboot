<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Product</title>
</head>
<body>
    <h1>Delete Product</h1>
    <p>Are you sure you want to delete this product?</p>
    <p>ID: ${product.id}</p>
    <p>Name: ${product.name}</p>
    <p>Description: ${product.description}</p>
    <p>Price: ${product.price}</p>
    
<form method="post" action="/deleteProduct/${product.id}">
        <input type="submit" value="Delete">
    </form>
    <a href="/">Back to Home</a>
</body>
</html>

