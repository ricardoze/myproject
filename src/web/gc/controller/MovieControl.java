package web.gc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.gc.domain.Movie;
import web.gc.service.MovieService;

public class MovieControl extends HttpServlet{
	private MovieService movieService;
	  public MovieControl() {
	        super();
	    }

		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		movieService=new MovieService();
		Movie movie;	
		String name=request.getParameter("title");
		String director=request.getParameter("director");
		String time=request.getParameter("time");
		String actors=request.getParameter("actors");
		String moviedescribe=request.getParameter("describe");
		String content=request.getParameter("content");
		float score=Float.parseFloat(request.getParameter("score"));
		long boxoffice=Long.parseLong(request.getParameter("boxoffice"));
		
		String callback = request.getParameter("callback");    
		 
		movie=new Movie(name, director, time, actors, moviedescribe, content,score,boxoffice);
		System.out.println(movie.toString());
		if (movieService.addMovie(movie)) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			String result="{'success':'true'}";
			String res=callback+"("+result+")"; 
	       	writer.write(res);
	       	writer.flush(); 
			writer.close();
	       	System.out.println("add finish");
		}
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
