<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Add Product</title>
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
    <h1>Add Product</h1>
    <form method="post" action="/addProduct">
    
    <label for="id">ID:</label>
        <input type="text" id="number" name="id" required><br>
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required><br>
        
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required><br>
        
        <input type="submit" value="Add">
    </form>
    <a href="/">Back to Home</a>
</body>
</html>
