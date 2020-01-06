<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>

<html>
<head>
	<title>Register</title>
	<script>
		$(function () {
			//为username绑定blur事件
			$("#username").blur(function () {

				//获取文本输入框的值
				var username = $(this).val();

				//利用正则表达式判断用户名的合法性
				var reg = /^\w{2,12}$/;
				var flag = reg.test(username);

				// 服务器响应回的数据格式：{"userExist":true,"msg":"用户名已存在"}/{"userExist":false,"msg":"用户名可用"}

				//如果用户名合法，发送ajax请求
				var s_username = $("#s_username");
				if (flag) {
					$.get("/web_day_20/findUserServlet", {username: username}, function (data) {
						//判断userExist键的值是否为true
						if (data.userExist) {
							//用户名存在
							s_username.css("color", "red");
							s_username.html(data.msg);
						} else {
							//用户名不存在
							s_username.css("color", "green");
							s_username.html(data.msg);
						}
					}, "json");
				} else {    //如果用户名不合法，给出提示信息
					s_username.css("color","red");
					s_username.html("用户名不能为空");
				}
			});
		});

	</script>
</head>
<body>

	<form>

		<input type="text" id="username" name="username" placeholder="请输入用户名">
		<span id="s_username"></span>
		<br>
		<input type="password" id="password" name="password" placeholder="请输入密码"><br>
		<input type="submit" value="注册"><br>

	</form>

</body>
</html>
