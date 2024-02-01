<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PMS</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: rgb(250,150,255);
	margin: 0;
	padding: 0;
}

h1 {
	text-align: center;
}

table {
	width: 80%;
	margin: 20px auto;
	border-collapse: collapse;
	background-color: white;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: dimgray;
	color: white;
}

tr:nth-child(even) {
	background-color: gainsboro;
}

a {
margin:50%;
}

a:hover {
	text-decoration: underline;
}

a:visited {
	color: green;
}

a.add-link {
	display: block;
	text-align: center;
	margin-top: 20px;
}
</style>

</head>
<body>
	<h1>Product Management</h1>
	<jsp:include page="productTable.jsp" />
	<a href="/addProduct">Add Product</a>
	
</body>
</html>