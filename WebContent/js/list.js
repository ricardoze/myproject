
// JavaScript Document


$(document).ready(function(e){
	
	$.ajax({
			type:"post",
			crossDomain:true,
			jsonp:"callback",  
			async:true,  
			//这里的链接也会因为跨域的原因出错
			url:"http://127.0.0.1:8080/GCVersion1_5/directory",
			data:{	"tag":"selectAll"},
			dataType:"JSONP",
			success:function(data){
				if(data.success=="true"){
					var name=data.name;
					var director=data.director;
					var score=data.score;
					addItem(name,director,score);
				}else{
					alert("获取失败");
				}
			}
			})
	
	$("#exit").click(function(){
		$.ajax({
			type:"post",
			url:"http://127.0.0.1:8080/GCVersion1_4/Exit",
			success:function(data){
				console.log("发出去啦")
			}
			
		});	
	});

});



function changepic(){
	console.log("change");
	var select=document.getElementById('select');
	var body=document.getElementById('pagebody');
	//console.log(select.options.selectedIndex)
	//console.log(select.options[select.options.selectedIndex].value)
	var year=select.options[select.options.selectedIndex].value;
	
	
	if(year==1999){
		body.style.background='url(images/wallhaven-12018.jpg)';
		}else if(year==2013){
		body.style.background="url(images/wallhaven-36230.png)";
		}
		else if(year==2017){
		body.style.background="url(images/wallhaven-195081.png)";
		}
	}

	
//setInterval("addItem()","1000")
function changefoot(){
	var foot=document.getElementById('footlog2');
	foot.innerHTML= Date();
	
	}

function showChild(){
	$("#child").fadeIn(0);
	}

function hideChild(){
	$("#child").fadeOut(0);
	}

function addItem(name,director,score){
	$("#items").append("<div class='item'><img src=''alt='图片'><a href=''>"+name+"</a><br/><b>"+director+"</b>	<br/><a>评分："+score	+"</a></div>")
	}
