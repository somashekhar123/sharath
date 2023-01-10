<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
</tr>
<c:forEach var="l" items="${leads}">
<tr>
<td><a href="finddata?id=${l.id}">${l.firstName}</a></td>
<td>${l.lastName}</td>
<td>${l.email}</td>
<td>${l.mobile}</td>
</tr>

</c:forEach>

</table>

</body>
</html>