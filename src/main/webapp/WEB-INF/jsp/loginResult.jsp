<%@ taglib prefix="c" uri="" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Result</title>
</head>
<body>
<h1>Login Result</h1>
<c:if test="${not empty loggedInUser}">
    <p>Login successful! Welcome, ${loggedInUser}.</p>
</c:if>
<c:if test="${empty loggedInUser}">
    <p>You are not logged in.</p>
</c:if>
</body>
</html>
