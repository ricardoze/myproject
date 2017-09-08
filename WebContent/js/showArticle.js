$(document).ready(function(e) {
	var str=$("#article").text()
	console.log(str)
	str=str.replace(/\r/g,'<br/>')
	str=str.replace(/\n/g,'<br/>')
	$("#article").html(str)
});// JavaScript Document