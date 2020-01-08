<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>Province</title>

	<script>
		$(function () {
			//发送ajax请求，加载所有省份
			$.get("/web_day_21/findAllServlet",
					function (data) {

						//遍历json数组,追加option
						$(data).each(function (index,element) {
							var option = "<option name='"+element.id+"'>"+element.name+"</option>";
							$("#province").append(option);
						});
					});
		});

	</script>

</head>
<body>

	<div>
		<select name="province" id="province">

			<option name="">--请选择--</option>

		</select>
	</div>
</body>
</html>
