<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Edit Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: whitesmoke;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: darkslategray;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 0 10px lightgray;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: gray;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid lightgray;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: steelblue;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: dodgerblue;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: steelblue;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Edit Product</h1>
    <form method="post" action="/editProduct/${product.id}">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${product.name}" required><br>
        
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" value="${product.description}" required><br>
        
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" value="${product.price}" required><br>
        
        <input type="submit" value="Save">
    </form>
    <a href="/">Back to Home</a>
</body>
</html>

