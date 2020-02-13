<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>upload</title>
</head>
<body>

	<h1>文件上传</h1>
	<form action="upl/show" method="post" enctype="multipart/form-data">
		姓名：<input type="text" name="username"/><br/>
		头像：<input type="file" name="profile"/><br/>
		<input type="submit" value="提交"/>
	</form>

</body>
</html>
