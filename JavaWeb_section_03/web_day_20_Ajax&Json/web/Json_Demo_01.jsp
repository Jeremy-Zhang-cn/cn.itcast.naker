<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>

<html>
<head>
	<title>Json Demo_01</title>
</head>
<body>
	<script>
		var person = {"name":"张三",age:23,'gender':true};
	//	var name = person.name;
		var name = person["name"];
	//	alert(name);
	//	alert(person);

		var people = {
			"people":[
				{"name":"张三","age":23,"gender":true},
				{"name":"李四","age":24,"gender":false},
				{"name":"王五","age":25,"gender":true}
			]
		};

		var ps = [
			{"name":"张三","age":23,"gender":true},
			{"name":"李四","age":24,"gender":false},
			{"name":"王五","age":25,"gender":true}
		];

	//	alert(people);
/*

		//原生js方式遍历
		for (var key in person) {
			alert(key + ":" + person[key]);
		}
*/

		//使用JQuery方式遍历
	/*
		$.each(ps,function () {
			for (var key in this) {
				alert(key + ":" + this[key]);
			}
		});
	*/
		/*$.each(ps,function (index,element) {
			for (var key in element) {
				alert(index + ":" + key + ":" + element[key]);
			}
		});*/

		//获取people中的people数组
		var p = people.people;
		$.each(p,function (index, element) { //遍历数组
			for (let key in element) {  //获取每一个对象的各个属性值
				alert(index + ":" + key + ":" + element[key]);
			}
		});

	</script>
</body>
</html>
