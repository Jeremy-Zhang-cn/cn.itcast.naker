//导入js文件并应用
var bar = require("./bar");
var logic = require("./logic");
require("./css/css1.css");
bar.info("100 + 200 = " + logic.add(100, 200));