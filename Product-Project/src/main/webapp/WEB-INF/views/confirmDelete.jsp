<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Confirm Delete Product</title>
    <style>
        body {
            background-color: LightGray;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        h1 {
            color: DarkSlateGray;
        }
        p {
            font-size: 18px;
            color: DarkOliveGreen;
        }
        form {
            margin-top: 20px;
        }
        input[type="submit"] {
            background-color: DarkSeaGreen;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
        a {
            display: inline-block;
            margin-top: 10px;
            padding: 5px 10px;
            text-decoration: none;
            background-color: LightSkyBlue;
            color: white;
            border-radius: 5px;
        }
        a:hover {
            background-color: SteelBlue;
        }
    </style>
</head>
<body>
    <h1>Confirm Delete Product</h1>
    <p>Are you sure you want to delete this product?</p>
    <form method="post" action="/deleteProduct/${product.id}">
        <input type="submit" value="Confirm Delete">
        <a href="/">Cancel</a>
    </form>
</body>
</html>
 