package web.gc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.gc.domain.User;
import web.gc.service.AccessAdd;


public class GCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public GCServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		if (user==null) {
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}else
			System.out.println("GCSevlet:"+user.toString());
			//System.out.println("GCServlet:"+user);
			
			addcount(request, response);
			
			AccessAdd add=new AccessAdd();
				
			Integer times=(Integer) getServletContext().getAttribute("count");
			Integer onlines=add.getOnline();
			
			session.setAttribute("AccessTimes", times );
			session.setAttribute("onlines", onlines);
			//用户名（权限）
			session.setAttribute("userAuthority", user.getUserName());
				
			
			
			
			
			//System.out.println("历史人数"+times);
			if (user.getUserName()!=null) {
				request.getRequestDispatcher("/WEB-INF/jsp/GaCro.jsp").forward(request,response);
			
			}else{
				request.getRequestDispatcher("index.jsp").forward(request,response);
			}
			
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void addcount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String addr=request.getRemoteAddr();
		ArrayList<String> list=(ArrayList<String>) getServletContext().getAttribute("addrlist");
		if (list==null) {
			list=new ArrayList<>();
		}
		int count =(int) getServletContext().getAttribute("count");
		
		if (!list.contains(addr)) {
			list.add(addr);
			count++;
			getServletContext().setAttribute("count", count);
			getServletContext().setAttribute("addrlist", list);
			
			
		}
		
		
	}
}
