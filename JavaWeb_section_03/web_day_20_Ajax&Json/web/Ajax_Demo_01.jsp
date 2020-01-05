<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>

<html>
<head>
	<title>Ajax Demo_01</title>

	<script>

		$(function () {
			$("#btn").click(function () {

				/*
				$.ajax({
					url:"/web_day_20/ajaxServlet", //请求路径
					type:"POST",    //请求方式
					data:{"username":"张三","age":23},    //请求参数
					success:function (data) {
						alert(data);
					},  //响应成功后的回调函数
					error:function () {
						alert("some error(s) occurred");
					},  //如果请求响应出现错误，会执行的回调函数
					dataType:"text"  //设置接收到的响应数据的格式
				});
				*/

		/*

				$.get(
					"/web_day_20/ajaxServlet",
					{username:"Tom"},
					function (data) {
						alert(data)
					},
					"text"
				);
			});
		*/


			$.post(
				"/web_day_20/ajaxServlet",
				{username:"Tom",age:21},
				function (data) {
					alert(data)
				},
				"text"
			);
		});

		});


	</script>

</head>
<body>

	<input type="button" id="btn" value="发送异步请求">
	<input type="text">

</body>
</html>
