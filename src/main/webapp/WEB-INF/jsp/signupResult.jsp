<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Signup Result</title>
</head>
<body>
<h1>Signup Result</h1>
<%
  String message = request.getParameter("message");
  if (message != null && !message.isEmpty()) {
    out.println("<p>" + message + "</p>");
  } else {
    out.println("<p>Signup was successful!</p>");
  }
%>
<a href="login">Go back to Login Page</a>
</body>
</html>
