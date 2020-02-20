//引入node.js内置http模块
var http = require("http");
var url = require("url");

//创建并监听服务器
http.createServer(function (req, resp) {

	resp.writeHead(200, {"Content-Type": "text/plain"});

	//解析请求地址

	var params = url.parse(req.url, true).query;

	for (var key in params) {
		resp.write(key + " = " + params[key]);
		resp.write("\n");
	}

	//发送响应数据
	resp.end("");

}).listen(8888);
console.log("服务器地址：http://localhost:8888");