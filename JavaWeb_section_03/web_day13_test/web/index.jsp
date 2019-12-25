<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Login</title>
</head>
<body>

<form action="loginServlet" method="post">
	<label for="username">用户名：</label>
	<input type="text" name="username" id="username"><br>
	<label for="password">密码：</label>
	<input type="text" name="password" id="password"><br>
	<input type="submit" value="登录">
</form>

</body>
</html>
