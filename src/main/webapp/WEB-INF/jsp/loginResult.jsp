<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success</title>
</head>
<body>
<h1>Login Success</h1>
<p>Welcome, <%= session.getAttribute("username") %>!</p>
</body>
</html>