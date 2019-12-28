<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>login</title>

	<script>
		window.onload=function () {
			document.getElementById("img").onclick=function () {
				this.src="/web_day15/verifyCodeServlet?time="+new Date().getTime();
			}
		}
	</script>

	<style>
		div{
			color: red;
		}
	</style>

</head>
<body>

	<form action="loginServlet" method="post">

		<table>

			<tr>
				<td><label for="username"></label>用户名：</td>
				<td colspan="2"><input type="text" name="username" id="username"></td>
			</tr>

			<tr>
				<td><label for="password"></label>密码：</td>
				<td colspan="2"><input type="password" name="password" id="password"></td>
			</tr>

			<tr>
				<td><label for="USER_VERIFY_CODE"></label>验证码：</td>
				<td><input type="text" name="USER_VERIFY_CODE" id="USER_VERIFY_CODE"></td>
				<td><img src="/web_day15/verifyCodeServlet" id="img" alt=""></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="登录"></td>
			</tr>

		</table>

	</form>

	<div><%=request.getAttribute("vc_error") == null ? "" : request.getAttribute("vc_error")%></div>
	<div><%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%></div>

</body>
</html>
