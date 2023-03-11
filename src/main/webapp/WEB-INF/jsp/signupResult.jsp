<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Signup Result</title>
</head>
<body>
<h1>Signup Result</h1>
<p>Signup successful! Welcome, ${username}.</p>
<p>Your information:</p>
<ul>
  <li>Username: ${username}</li>
  <li>Password: ${password}</li>
  <li>Phone Number: ${phone}</li>
  <li>Email: ${email}</li>
</ul>
<a href="login">Back to the Login Page</a>

</body>
</html>
