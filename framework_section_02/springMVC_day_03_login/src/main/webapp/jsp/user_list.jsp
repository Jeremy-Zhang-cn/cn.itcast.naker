<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>user list</title>
</head>
<body>

	<table border="1" width="600">

		<tr>
			<td>编号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>昵称</td>
			<td>性别</td>
			<td>年龄</td>
			<td>地址</td>
		</tr>

		<c:forEach items="${list}" var="user">

			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.nickname}</td>
				<td>${user.gender}</td>
				<td>${user.age}</td>
				<td>${user.address}</td>
			</tr>

		</c:forEach>

	</table>

	<h3><a href="${pageContext.request.contextPath}/index.jsp">回到首页</a></h3>

</body>
</html>
