<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>编辑窗口</title>
<link rel="stylesheet" type="text/css" href="css/edit.css"/>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/edit.js"></script>
</head>
<body>

<div  id="title">
<input id="titletext" type="text" placeholder="电影标题"></textarea><br/>
</div>
<div  id="director">
<input id="directortext" type="text" placeholder="导演"></textarea><br/>
</div>

<div  id="score">
<input id="scoretext" type="number" step="0.01"  placeholder="评分"></textarea><br/>
</div>

<div  id="boxoffice">
<input id="boxofficetext" type="number" placeholder="票房"></textarea><br/>
</div>


<div  id="time">
<input id="timetext"  type="text" placeholder="上映时间"></textarea><br/>
</div>

<div  id="actors">
<input  id="actorstext" type="text" placeholder="演员"></textarea><br/>
</div>

<div  id="describe" >
<textarea id="textarea1" onKeyUp="changeLine(this)" onKeyDown="changeLine(this)" placeholder="简介"></textarea>
</div>
<div id="content">
<textarea id="textarea2" onKeyUp="changeLine(this)" onKeyDown="changeLine(this)" placeholder="影评"></textarea>
</div>

<div align="center">
<div id="submit">
<input  type="submit" value="提交" >
</div>
<div id="reset">
<input  type="submit" value="重置" onClick="resetInput()"  >
</div>

</div>
</body>
</html>