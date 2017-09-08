<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="css/top.css"/>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css"/>
<link rel="stylesheet" href="css/style.css">
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
<script src="js/Homepage.js" type="text/javascript"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script src="js/index.js"></script>
</head>

<body background="images/wallhaven-71485.jpg">

<div style=" height:400px; max-width:45%; margin-left:30%">

<div class="slider-container">
<div class="slider-control left inactive"></div>
<div class="slider-control right"></div>
<ul class="slider-pagi"></ul>
<% Integer userid=(Integer)session.getAttribute("userId");
	Integer times=(Integer)session.getAttribute("AccessTimes");
	Integer onlines=(Integer)session.getAttribute("onlines");
	
%>

<div class="slider-container">
<div class="slider-control left inactive"></div>
<div class="slider-control right"></div>
<ul class="slider-pagi"></ul>
<div class="slider">
<div class="slide slide-0 active">
  <div class="slide__bg"></div>
  <div class="slide__content">
	<svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
	  <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
	</svg>
	<div class="slide__text">
	  <h2 class="slide__text-heading">Project name 1</h2>
	  <p class="slide__text-desc"></p>
	  <p class="slide__text-desc">来源：<a href="" target="_blank">素材</a></p>
	</div>
  </div>
</div>
<div class="slide slide-1 ">
  <div class="slide__bg"></div>
  <div class="slide__content">
	<svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
	  <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
	</svg>
	<div class="slide__text">
	  <h2 class="slide__text-heading">Project name 2</h2>
	  <p class="slide__text-desc">quia.</p>
	  <a class="slide__text-link">Project link</a>
	</div>
  </div>
</div>
<div class="slide slide-2">
  <div class="slide__bg"></div>
  <div class="slide__content">
	<svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
	  <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
	</svg>
	<div class="slide__text">
	  <h2 class="slide__text-heading">Project name 3</h2>
	  <p class="slide__text-desc">quia.</p>
	  <a class="slide__text-link">Project link</a>
	</div>
  </div>
</div>
<div class="slide slide-3">
  <div class="slide__bg"></div>
  <div class="slide__content">
	<svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
	  <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
	</svg>
	<div class="slide__text">
	  <h2 class="slide__text-heading">Project name 4</h2>
	  <p class="slide__text-desc">quia.</p>
	  <a class="slide__text-link">Project link</a>
	</div>
  </div>
</div>
</div>
</div>
</div></div>
	
		<div>
			<ul id="nav">
			<li><a href="#">游戏</a>  <a href="#">动漫</a>  <a href="#" >音乐</a>  <a href="#">运动</a> <div> <a href="#" id="moviemenu" onmouseover="showChild()" onMouseOut="hideChild()">影视</a>
				</div><a href="../../article.jsp" >文学</a> <a href="http://127.0.0.1:8080/GCVersion1_5/Close" id="exit">退出</a> 
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
			
			<li>历史次数：<%=times%></li>
			<li>在线人数：<%=onlines%></li>
			<br />
		</ul>

	</div>




	<div style="float: right; width: 90%; height: 100%">

		<!--显示列表 版本3.0 -->

		<div id="list">

			<ul>
				<li>
					<!-- 版本4 添加点击图片放大功能-->
					<div>
						<a href="images/01.jpg"> <img id="img" class="min"
							src="images/01.jpg">
						</a>
					</div>
					<div id="title">
						<a href="">标题</a><br />
						<h3>←点击时弹窗放大当前图片 可关闭</h3>
						<%=userid %>
						<p>脚注</p>
					</div>
				</li>


				<li>
					<div>
						<a href="images/01.jpg"> <img id="img" class="min"
							src="images/01.jpg" />
						</a>
					</div>
					<div id="title">
						<a href="">标题</a><br />
						<h3>←点击时弹窗放大当前图片 可关闭</h3>
						<p>脚注</p>
					</div>
				</li>

				<li><div>
						<a href="images/01.jpg"> <img id="img" class="min"
							src="images/01.jpg" />
						</a>
					</div>
					<div id="title">
						<a href="">标题</a><br />
						<h3>←点击时弹窗放大当前图片 可关闭</h3>
						<p>脚注</p>
					</div></li>

				<li><div>
						<a href="images/01.jpg"> <img id="img" class="min"
							src="images/01.jpg" />
						</a>
					</div>
					<div id="title">
						<a href="">标题</a><br />
						<h3>←点击时弹窗放大当前图片 可关闭</h3>
						<p>脚注</p>
					</div></li>

		

			
			</ul>

<ul class="pagination">
<li><a href="">首页</a></li>
<li><a href="">&lt;上一页</a></li>
<li><a href="">2</a></li>
<li><a href="">3</a></li>
<li><a href="">4</a></li>
<li><a href="">5</a></li>
<li><a href="">下一页&gt;</a></li>
<li><a href="">末页</a></li>
</ul>






		</div>












		<!--显示列表
暂不使用的iframe
<iframe style="width:100%; height:60%" frameborder="1"></iframe>

-->
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
