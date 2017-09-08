
// JavaScript Document


$(document).ready(function(e){
$("#exit").click(function(){
	$.ajax({
			type:"post",
			url:"/GcVersion1_5/Exit",
			success:function(data){
				console.log("发出去啦")
			}
			
		});	
	});





});

function showimg(t){

	var url=t.src;
	url=url.split("/")
	
	var link=url[url.length-2]+"/"+url[url.length-1]
	//alert(link)
	  $("#picmodal").find("#img1").html("<image src='"+link+"' class='carousel-inner img-responsive img-rounded' />");
         $("#picmodal").modal();
	
	
	}

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

	
setInterval("addItem()","1000")
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

function addItem(){
	$("#items").append("<div class='item'><img src=''alt='图片'><a href=''>影片名</a><br/><b>导演</b>	<br/><a>评分：</a></div>")
	}
