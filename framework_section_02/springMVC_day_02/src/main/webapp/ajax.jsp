<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>AJax</title>
	<script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
	<script type="text/javascript">

		$(function () {

			$("#btn").click(function () {

				$.post("other/ajaxShow",{"name":"zhangsan","age":"23"},function (msg) {
					alert(msg);
				});
/*

				$.ajax({
					url:"other/ajaxShow",
					type:"POST",
					data:{"name":"zhangsan","age":"23"},    // --> json对象
					success:function (msg) {
						alert(msg);
					}
				});

				$.ajax({
					url:"other/ajaxShow",
					type:"POST",
					data:'{"name":"zhangsan","age":"23"}',    // --> json字符串
					contentType:"application/json;charset=utf-8", //告诉后台当前的参数类型
					success:function (msg) {
						alert(msg);
					}
				});
*/


			});
		});

	</script>
</head>
<body>

	<input type="button" id="btn" value="发送异步请求"/>

</body>
</html>
