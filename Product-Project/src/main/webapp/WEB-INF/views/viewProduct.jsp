<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
    <title>View Product</title>
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
        p {
            font-size: 18px;
            color: gray;
            margin: 10px;
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
    <h1>Product Details</h1>
    <p>ID: ${product.id}</p>
    <p>Name: ${product.name}</p>
    <p>Description: ${product.description}</p>
    <p>Price: ${product.price}</p>
    <a href="/">Back to Home</a>
</body>
</html>
