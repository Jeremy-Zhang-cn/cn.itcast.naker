<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>show</title>
</head>
<body>
	<h1>SHOW</h1>


	<table width="200px" border="1">

		<tr>
			<td>序号</td>
			<td>姓名</td>
			<td>金额</td>
		</tr>

		<c:forEach items="${accountList}" var="account" varStatus="vs">
			<tr>
				<td>${vs.index + 1}</td>
				<td>${account.name}</td>
				<td>${account.money}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
