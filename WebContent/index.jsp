<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="css/homepage.css">
<style type="text/css">
div #btn {
	text-align: center;
}
div #rem{
	text-align: center;
	margin-bottom:40px;
}
div #btn input {
	background-color: #000;
	border: hidden;
	color: #FFF;
	height: 35px;
	width: 264px;
	border-radius: 3px;
	font-weight: 300;
	font-size: 16px;
	font-family: "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial,
		"Lucida Grande", sans-serif;
}

div #btn input a {
	text-align: center;
}

div #btn input:hover {
	background: #666
}
</style>

<title>Garnet Crow</title>

<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/gc.js"></script>
</head>

<body>
	<div style="text-align: center">
		<font size="48" color="#666666">GARNET CROW</font>
	</div>

	<br>
	<div align="center">
		<!--
<table>
<td> -->
		中村由利<br>
		<!--
</td>
<td>-->
		Azuki七
		<!--</td>
</table>-->
	</div>
	<hr />
<%
    String username = "";
    String password = "";
     //获取当前站点的所有Cookie
   	 Cookie[] cookies = request.getCookies();
    if(cookies!=null){
	     for (int i = 0; i < cookies.length; i++) {
	    	 //对cookies中的数据进行遍历，找到用户名、密码的数据
	         if ("username".equals(cookies[i].getName())) {
	             username = cookies[i].getValue();
	         } else if ("password".equals(cookies[i].getName())) {
	             password = cookies[i].getValue();
	         }   
	     }
     }
%>

	<div style="background: #CCC; color: #fff">
		<br>
		<form id="login" action="http://127.0.0.1:8080/GCVersion1_5/jumpPage.jsp" method="post">
			<div style="text-align: center">

				<input type="text" name="userName" id="userName" aria-label="请输入昵称"
				value="<%=username%>" 
					placeholder="请输入昵称" style="height: 35px; width: 264px" />
			</div>
			<br />
			<div style="text-align: center">

				<input type="password" name="password" id="password" aria-label="请输入密码"
					value="<%=password%>"
					placeholder="请输入密码" style="height: 35px; width: 264px" /><br>
				<p id="warn"></p>
			</div>
			<br />
			<div  id="rem">
			<input type="checkbox" name="remember" id="remem"/>记住密码
			</div>
		</form>
		<div id="btn">
			<input type="submit" value="登陆">
		</div>

		<br />
		<div id="signup" style="text-align: center">
			<button type="submit"
				class=" button button-primary  button-longshadow-right"
				style="width: 264px; height: 35px; border-radius: 3px">
				<a>注册</a>
			</button>
		</div>
		<!-- </form> -->
		<br />
	</div>


	<div align="center">
		<script charset="Shift_JIS"
			src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.js"></script>
		<p></p>
	</div>
</body>
</html>