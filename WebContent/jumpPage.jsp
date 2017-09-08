<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="web.gc.domain.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<title>跳转页面</title>
</head>
<body>
	<div style="text-align: center">
		<h1>ジャンプ</h1>
		<%
			String name=request.getParameter("userName");
			String psw=request.getParameter("password");
			out.print(name);
			out.print(psw);
			Thread.sleep(1000);
			User user=new User(name,psw);
			session.setAttribute("user", user);
			request.getRequestDispatcher("/GCS").forward(request,response);
		%>
		
		<img src="WEB-INF/jsp/images/timg.jpg" width="400px" alt="Garnet-Pic" /><br>
		<a href="GC.html">リターン</a>
	</div>

</body>
</html>
