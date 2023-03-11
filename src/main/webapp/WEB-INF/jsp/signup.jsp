<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup Page</title>
</head>
<body>
<h1>Signup Page</h1>

<form method="post" action="signup">
    <label>Username:</label>
    <input type="text" name="username" required>
    <br>
    <label>Password:</label>
    <input type="password" name="password" required>
    <br>

    <label>Phone Number:</label>
    <input type="phone" name="phone" required>
    <br>

    <label>Email:</label>
    <input type="email" name="email" required>
    <br>
    <button type="submit">Signup</button>
</form>
</body>
</html>