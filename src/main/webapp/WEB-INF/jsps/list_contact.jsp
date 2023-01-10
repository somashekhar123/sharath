<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>List All Contact</h3>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Billing</th>
</tr>
<c:forEach var="d"  items="${cont}">

<tr>
<td>${d.firstName}</td>
<td>${d.lastName}</td>
<td>${d.email}</td>
<td>${d.mobile}</td>
<td><a href="generatebill?id=${d.id }">Generate Bill</a>
</tr>
</c:forEach>


</table>

</body>
</html>