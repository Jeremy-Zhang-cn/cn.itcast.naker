var path = require("path");

module.exports = {
	//入口文件
	entry:"./src/main.js",
	output:{
		//路径
		path: path.resolve(__dirname, "./dist"),
		filename:"bundle.js"
	},
	module:{
		rules:[
			{
				test: /\.css$/,
				use: ["style-loader", "css-loader"]
			}
		]
	}
};