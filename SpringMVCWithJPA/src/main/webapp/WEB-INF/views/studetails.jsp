<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored = "false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>

<h2>-----Welcome to CDAC Student Management System -----</h2>

<table border="2" >
<tr>
<td>Rollno</td>
<td>Name</td>
<td>Address</td>
<td>Marks</td>
</tr>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.id }</td>
<td>${item.name}</td>
<td>${item.address}</td>
<td>${item.marks}</td>
<td><a href='stu/${item.id }'>Edit</a>|
<a href='delstu/${item.id }'>Delete</a>
</tr>
</c:forEach>

</table>
</body>
</html>