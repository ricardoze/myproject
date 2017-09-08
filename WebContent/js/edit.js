

// JavaScript Document
$(document).ready(function(e) {
	  $('.summernote').summernote({
        height: 200,
		
      });
/*
      $('form').on('submit', function (e) {
        e.preventDefault();
        alert($('.summernote').summernote('code'));
        alert($('.summernote').val());
      });*/
	
	$("#submit").click(function(){
		var title=$('#titletext').val();
		var director=$('#directortext').val();
		var time=$('#timetext').val();
		var actors=$('#actorstext').val();
		var score=$('#scoretext').val();
		var boxoffice=$('#boxofficetext').val();
		var describe=$('#textarea1').val();
		var content=$('#textarea2').val();
	
		console.log(score)
		$.ajax({
			type:"post",
			crossDomain:true,
			jsonp:"callback",  
			async:true,  
			//这里的链接也会因为跨域的原因出错
			url:"http://127.0.0.1:8080/GCVersion1_5/AddMovie",
			data:{"title":title,"director":director,"score":score,"boxoffice":boxoffice,
				"time":time,"actors":actors,
				"describe":describe,"content":content,
			/*"tag":"login"*/},
			dataType:"JSONP",
			success:function(data){
				if(data.success=="true"){
					alert("添加成功");
					resetInput();
				}else{
					alert("添加失败");
				}
			}
			})
		
		})
});

function closeModal(){
	$("#resetModel").modal('hide')
	console.log("closeModal")
	}


function resetInput(){
	closeModal();
	for(i=0;i<$('input').length;i++){ 
		if($('input')[i].type!="submit"){
			$('input')[i].value="";    
		}
    } 
	for(i=0;i<$('textarea').length;i++){ 
		$('textarea')[i].value="";    
    }   
}
function changeLine(o){
	if (window.navigator.userAgent.indexOf("Firefox") > -1) {
        o.style.height = o.scrollTop + o.scrollHeight + "px";
      }
      else {
        if (o.scrollTop > 0) o.style.height = o.scrollTop + o.scrollHeight + "px";
      }	
}
