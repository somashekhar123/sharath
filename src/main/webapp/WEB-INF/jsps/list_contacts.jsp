<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<form action="saveBill" method="post">
<pre>

FirstName  <input type="text" name="firstName"  value="${con.firstName}"/>

LatName    <input type="text" name="lastName" value="${con.lastName}"/>

Email      <input type="text" name="email" value="${con.email}"/>

Mobile     <input type="text" name="mobile" value="${con.mobile }"/>

product    <input type="text" name="product"/>

Amount     <input type="text" name="amount"/>

        <input type="submit" value="SaveBill"/>
</pre>
</form>
</body>
</html>