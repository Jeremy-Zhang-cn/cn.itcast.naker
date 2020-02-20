<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>save</title>
</head>
<body>

	<h1>SAVE</h1>

	<form name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">

		<label for="name">姓名：</label><input type="text" name="name" id="name"/><br/>
		<label for="money">金额：</label><input type="number" name="money" id="money"/><br/>
		<input type="submit" value="提交"/>

	</form>

</body>
</html>
