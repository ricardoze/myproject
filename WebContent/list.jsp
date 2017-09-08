<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<title>资料库</title>
<link rel="stylesheet" type="text/css" href="css/top.css"/>
<style>
.menu {
	text-align: left;
	float: left;
	background: #CCC;
	padding: 8px;
	align: center;
	width: 90%;
	height: 90px
}

.exit {
	text-align: center;
	vertical-align: central;
	width: 10%;
	height: 90px
}

.bottom {
	float: left;
	width: "50%";
	margin-left: 30px
}
</style>

<script src="js/jquery-3.2.1.js" type="text/javascript"></script>
<script src="js/list.js" type="text/javascript"></script>

</head>

<body background="images/wallhaven-195081.png">

	
	<div>
		<div>
			<ul id="nav">
			<li><a href="#">游戏</a>  <a href="#">动漫</a>  <a href="#" >音乐</a>  <a href="#">运动</a> <div> <a href="#" id="moviemenu" onmouseover="showChild()" onMouseOut="hideChild()">影视</a>
				</div><a href="#" >文学</a> <a href="#" id="exit">退出</a> 
			</li>
			</ul>
			<ul id="child" onmouseover="showChild()" onMouseOut="hideChild()">
			<li><a href="#" >**</a><a href="#" >**</a><a href="list.jsp">查看</a> <a href="edit.jsp" >编辑</a><a href="#" >历史</a><a href="#" >分类</a><a href="#" >**</a>
			</li>
			</ul>
		</div>
	</div>
	<div style="float: left; width: 10%; height: 100%">
		<!--
<img src="imgs/wallhaven-12018.jpg" style="max-width:100%;"/>
-->

		<ul id="side">
			<li><a href="https://www.pixiv.net/" target="_blank">PIXIV</a></li>
			<br />
			<li><a href="https://translate.google.cn/?hl=zh-CN&tab=TT/"
				target="_blank">GOOGLE</a></li>
			<br />
			<li><a href="http://www.sioe.cn/yingyong/yanse-rgb-16//"
				target="_blank">COLOR</a></li>
			<br />
			<li><a href="https://www.zhihu.com/" target="_blank">知乎</a></li>
			<br />

		</ul>

	</div>




	<div id="outItems" style=" height: 100%; margin-left:12%;margin-top: 20px;">

		<!--显示列表 版本4.0 -->
	
		<div id="items" >
       	<!--往其中追加元素-->
        </div>




	</div>
	</div>








	<footer>

	<div id="logo">

		<div style="float: left">
			<select style="margin-left: 10px">
				<option value="1999">1999</option>
				<option value="2013">2013</option>
				<option value="2017" selected>2017</option>
			</select>
		</div>
		<br />
		<br /> <img src="pic.PNG" alt="logo" height="34px"><br />
		<div
			style="color: #FFF; text-shadow: #333 3px 3px 3px; width: 160px; margin-left: 10px;">By
			RicardoZ</div>
	</div>
	<div style="float: right">
		<a name="bottom" href="#top"><img src="images/down.png"
			style="transform: rotate(180deg)" width="48px" height="48px"></a>
	</div>
	</footer>

</body>
</html>