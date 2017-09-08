package web.gc.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import web.gc.domain.User;
import web.gc.service.UserService;

public class LoginServlet extends HttpServlet{
	private static int times;
	private UserService service;
	public LoginServlet() {
	        super();
	    }
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String passWord=request.getParameter("password");
		String rem=request.getParameter("rem");
		String tag=request.getParameter("tag");
		String callback = request.getParameter("callback"); 
		System.out.println(rem);
		
		//将登陆的数据存进cookie里（可以不在后台做，由于数据加密的原因）
		if (rem!=null) {
			if (rem.equals("on")) {
				Cookie namecookie=new Cookie("username",userName);
				Cookie pswcookie=new Cookie("password", passWord);
				response.addCookie(pswcookie);
				response.addCookie(namecookie);
				System.out.println(namecookie.getValue());
				System.out.println("addCookie");
			}
		}
		
		//在session中存入用户的id
		HttpSession session =request.getSession();
		session.setAttribute("userId", userName.hashCode());
		
		
		
		service=new UserService();
		User user=new User(userName, passWord);
		System.out.println("LoginServlet"+user.toString());
		//System.out.println(tag);
		PrintWriter writer = response.getWriter();
		switch (tag) {
		case "login":
			if(service.login(user)){
				System.out.println("login start");
		       	response.setContentType("text/html;charset=UTF-8");
				
				String result="{'success':'true'}";
				String res=callback+"("+result+")"; 
				System.out.println(res);
		       	writer.write(res);
		       	writer.flush(); 
				writer.close();
		       	System.out.println("login finish");
			}else{
				String result="{'success':'false'}";
				String res=callback+"("+result+")"; 
				System.out.println(res);
		       	writer.write(res);
		       	writer.flush(); 
				writer.close();
		       	System.out.println("login fail");
				
			}
			break;
		case "signup":
			if (service.signup(user)) {
				response.setContentType("text/html;charset=UTF-8");
				
				String result="{'success':'true'}";
				String res=callback+"("+result+")"; 
				System.out.println(res);
		       	writer.write(res);
		       	writer.flush(); 
				writer.close();
		       	System.out.println("signup finish");
			}
			break;
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
