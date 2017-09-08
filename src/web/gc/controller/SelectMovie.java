package web.gc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.gc.domain.Movie;
import web.gc.service.MovieService;

public class SelectMovie extends HttpServlet{
	private MovieService movieService;
	  public SelectMovie() {
	        super();
	    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		movieService=new MovieService();
		String callback = request.getParameter("callback");    
		
		HashSet<Movie> set=movieService.selectAll();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Movie movie = (Movie) iterator.next();
			
			
			String name="\"name\":'"+movie.getName()+"',";
			String director="\"director\":'"+movie.getDirector()+"',";
			//String time="\"time\":'"+movie.getTime()+"',";
			//String actors="\"actors\":'"+movie.getActors()+"',";
			String moviedescribe="\"moviedescribe\":'"+movie.getMoviedescribe()+"',";
			//String content="'content':'"+movie.getContent()+"',";
			String score="\"score\":'"+movie.getScore()+"',";
			//String boxoffice="'boxoffice':'"+movie.getBoxoffice()+"'";
			moviedescribe=moviedescribe.replaceAll("\\s+", " ");
			System.out.print(moviedescribe);
			//moviedescribe=moviedescribe.replaceAll(" ","");
			//moviedescribe="'moviedescribe':'"+moviedescribe+"',";
			
			//System.out.print(moviedescribe);
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			String result="{'success':'true',"+name+director+moviedescribe+score
						+"}";
			String res=callback+"("+result+")"; 
	       	writer.write(res);
	       	writer.flush(); 
			writer.close();
	       	
		}
		System.out.println("output finish");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
