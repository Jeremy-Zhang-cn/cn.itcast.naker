<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
	<!-- 指定字符集 -->
	<meta charset="utf-8">
	<!-- 使用Edge最新的浏览器的渲染方式 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
	width: 默认宽度与设备的宽度相同
	initial-scale: 初始的缩放比，为1:1 -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>用户信息管理系统</title>

	<!-- 1. 导入CSS的全局样式 -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- 2. jQuery导入，建议使用1.9以上的版本 -->
	<script src="js/jquery-2.1.0.min.js"></script>
	<!-- 3. 导入bootstrap的js文件 -->
	<script src="js/bootstrap.min.js"></script>
	<style type="text/css">
		td, th {
			text-align: center;
		}
	</style>

	<%--删除用户前要确认--%>
	<script>
		function deleteUser(id) {

			if (confirm("确认删除？")){
				location.href="${pageContext.request.contextPath}/delSingleUserServlet?id="+id;
			}
		}

		window.onload = function () {

			//绑定删除按钮单击事件
			document.getElementById("deleteSelected").onclick=function () {

				if (confirm("确定删除？")){
					//表单提交
					document.getElementById("myForm").submit();
				}
			}

			//获取全选复选框
			document.getElementById("first_cb").onclick=function () {
				//获取表中所有cb
				var cbs = document.getElementsByName("cb");

				for (var i = 0; i < cbs.length; i++) {
					//设置所有cb的选中状态与全选框一致
					cbs[i].checked = this.checked;
				}
			}

		}

	</script>

</head>
<body>
<div class="container">

	<h3 style="text-align: center">用户信息列表</h3>

	<div style="float: right; margin:5px">
		<a class="btn btn-primary" href="add.jsp">添加联系人</a>
		<a class="btn btn-primary" id="deleteSelected" href="javascript:void(0);">删除选中</a>
	</div>

	<div style="float: left; margin: 5px">

		<form class="form-inline">

			<div class="form-group">
				<label for="example_1">姓名</label>
				<input type="text" class="form-control" id="example_1">
			</div>

			<div class="form-group">
				<label for="example_2">籍贯</label>
				<input type="text" class="form-control" id="example_2">
			</div>

			<div class="form-group">
				<label for="example_3">邮箱</label>
				<input type="text" class="form-control" id="example_3">
			</div>

			<button type="submit" class="btn btn-default">查询</button>

		</form>
	</div>

	<form id="myForm" action="${pageContext.request.contextPath}/deleteSelectedServlet" method="post">

		<table border="1" class="table table-bordered table-hover">

			<tr class="success">
				<th><input type="checkbox" id="first_cb"></th>
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>籍贯</th>
				<th>QQ</th>
				<th>邮箱</th>
				<th>操作</th>
			</tr>

			<c:forEach items="${requestScope.users}" var="user" varStatus="s">
				<tr>
					<td><input type="checkbox" id="cb" name="cb" value="${user.id}"></td>
					<td>${s.count}</td>
					<td>${user.name}</td>
					<td>${user.gender}</td>
					<td>${user.age}</td>
					<td>${user.address}</td>
					<td>${user.qq}</td>
					<td>${user.email}</td>
					<td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">修改</a>&nbsp;
						<a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.id});">删除</a></td>
				</tr>
			</c:forEach>

		</table>
	</form>
	<div>

		<nav aria-label="Page navigation">
			<ul class="pagination">
				<li>
					<a href="#" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li>
					<a href="#" aria-label="Next">
						<span aria-hidden="true">&raquo;</span>
					</a>
				</li>
				<span style="font-size: 25px;margin-left: 5px;">
                    共16条记录，共4页
                </span>

			</ul>
		</nav>

	</div>

</div>
</body>
</html>
