<%@ page import="java.util.ArrayList" %>
<%@ page import="com.itheima.day16.demo_01.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>EL DEMO_01</title>
</head>
<body>

	<%
		List list = new ArrayList<User>();
		list.add(new User("张三", 23, new Date()));
		list.add(new User("李四", 24, new Date()));
		list.add(new User("王五", 25, new Date()));

		request.setAttribute("list",list);

	%>

	<table border="1" width="600" align="center">

		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>生日</th>
		</tr>

		<%--数据行--%>
		<c:forEach items="${list}" var="user" varStatus="s">

			<c:if test="${s.count % 2 != 0}">
				<tr bgcolor="#ffb6c1">
					<td>${s.count}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
					<td>${user.birStr}</td>
				</tr>
			</c:if>

			<c:if test="${s.count % 2 == 0}">
				<tr bgcolor="#ffd700">
					<td>${s.count}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
					<td>${user.birStr}</td>
				</tr>
			</c:if>

		</c:forEach>

	</table>

</body>
</html>
