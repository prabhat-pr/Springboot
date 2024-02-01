<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error{
color:red;
font-family: vardana;
font-size: 20px;
}
</style>
</head>
<body>
<forms:form action="processform2"  method="post">
<table>
<tr><td><forms:label path="id">Id</forms:label></td>
<td><forms:input path="id"/>
<br>
<forms:errors path="id" cssClass="error"></forms:errors>
</td></tr>
<tr><td><forms:label path="name">Name</forms:label></td>
<td><forms:input path="name"/>
<br>
<forms:errors path="name" cssClass="error"></forms:errors>
</td></tr>
<tr><td><forms:label path="marks">Marks</forms:label></td>
<td><forms:input path="marks"/>
<br>
<forms:errors path="marks" cssClass="error"></forms:errors>
</td></tr>
<tr><td><forms:label path="address">Address</forms:label></td>
<td><forms:input path="address"/>
<br>
<forms:errors path="address" cssClass="error"></forms:errors>
</td></tr>
<tr><td><Input type="submit" value="Submit"></td></tr>
</table>
</forms:form>
</body>
</html>