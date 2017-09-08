// JavaScript Document

$(document).ready(function(e) {
    var btn=document.getElementById("btn");
   
	btn.onclick=function(){
		var username=$('#userName').val();
		var psw=$('#password').val();
		var rem=$('#remem').val();
		//alert(rem);
		$.ajax({
			type:"post",
			crossDomain:true,
			jsonp:"callback",  
			async:true,  
			url:"http://127.0.0.1:8080/GCVersion1_5/Login",
			data:{"username":username,"password":psw,"tag":"login","rem":rem},
			dataType:"JSONP",
			error: function(error) {
                console.log(error);          
            },
			success:function(data){
				alert(data.success);
				if(data.success=="true"){
					jump(username,psw);
				}else{
					warn();
				}
			}
			
		});		
		}
		$("#signup").click(function(){
			var username=$('#userName').val();
			var psw=$('#password').val();
			$.ajax({
			//使用load/post/get等封装好的方法更加方便
			//getScript加载js脚本getJSON加载json文件
				type:"post",
				crossDomain:true,//跨域请求
				jsonp:"callback",  
				async:true,  
				url:"http://127.0.0.1:8080/GCVersion1_5/Login",
				data:{"username":username,"password":psw,"tag":"signup"},
				dataType:"JSONP",
				success:function(data){
					 alert(data.res);  
				        var s =JSON.stringify(data);  
				        alert(s);  
				if(data=="success"){
					alert("注册成功");
				}else{
					alert("注册失败");
				}
			}
			})
		}); 
		
}); 
function warn(){
	$("#warn").html("<b>密码错误</b>")
	}
function jump(userName,password){
	//alert(userName);
	//alert(password);
	
	var form=document.getElementById("login");
	//alert(form)
	form.submit();
	//window.location.href="/GcVersion1_0/jumpPage.jsp?userName="+userName+"&password="+password;
	}
