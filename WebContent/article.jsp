<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>编辑文章</title>
<script src="js/jquery-3.2.1.js"></script>

<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css"/>
<script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>

<link rel="stylesheet" href="css/summernote.css"/>
<script src="js/summernote.js"></script>

<link rel="stylesheet" type="text/css" href="css/edit.css"/>
<script src="js/edit.js"></script>

</head>
<body bgcolor="#000000">

<div  id="title">
<input id="titletext" type="text" placeholder="标题"></textarea><br/>
</div>
<div  id="director">
<input id="directortext" type="text" placeholder="作者"></textarea><br/>
</div>

<div  id="time">
<input id="timetext"  type="text" placeholder="发表时间"></textarea><br/>
</div>

<div  id="actors">
<input  id="actorstext" type="text" placeholder="原文链接"></textarea><br/>
</div>

<div  id="describe" >
<textarea  id="textarea1" name="text" class="summernote" id="contents" title="Contents">编辑简介</textarea>
</div>
<div id="content">
<textarea  id="textarea2" name="text" class="summernote" id="contents" title="Contents">编辑内容</textarea>
</div>

<div align="center">
<div id="submit">
<button class="btn btn-success" style="width:160px">提交</button>
</div>
<div id="reset">
<button class="btn-danger btn" data-toggle="modal" data-target="#resetModel" style="width:160px" >
重置</button>
</div>
<div class="progress progress-striped active" style="margin:50px">
<div class="progress-bar-success progress-bar  " style="width:35%">35%</div>
</div>
</div>




<div class="modal" style="margin-left:30%;margin-right:30%"  id="resetModel">
<div class="modal-dialog"></div>
<div class="modal-content">
<div class="modal-header"><button class="close" data-dismiss="modal"><span>&times;</span></button><h3 class="modal-title">重置</h3></div>
<div class="modal-body">是否删除输入的内容?
<br/><br/>操作不可撤销

</div>
<div class="modal-footer" style="text-align:center"><button class="btn btn-danger" onClick="resetInput()">重置</button>
      <button class="btn btn-success" onClick="closeModal()">放弃</button></div></div>
</div>
  
</body>
</html>