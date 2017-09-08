package web.gc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import web.gc.domain.Movie;
import web.gc.domain.User;

public class MovieDao {
/*
create table movielist(
	name varchar(20),
	director varchar(20),
	time varchar(20),
	actors TEXT,
	moviedescribe TEXT,
	content TEXT,
	score numeric(10,1),
	boxoffice bigint
	);
	
create table access (
	times int
	);
*/

	private Connection connection=null;
	
	public void ConnectSql(){
		String url="jdbc:mysql://localhost:3306/GC?characterEncoding=utf-8";
		String username="root";
		String password="admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int addMovie(Movie movie){
		String name=movie.getName();
		String director=movie.getDirector();
		String time=movie.getTime();
		String actors=movie.getActors();
		String moviedesvribe=movie.getMoviedescribe();
		String content=movie.getContent();
		float score=movie.getScore();
		long boxoffice=movie.getBoxoffice();
		int i = 0;
		String addsql="insert into movielist values ('"+name+"','"
				+director+"','"
				+time+"','"
				+actors+"','"
				+moviedesvribe+"','"
				+content+"','"
				+score+"','"
				+boxoffice
				+"');";
		try {
			i=connection.prepareStatement(addsql).executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	//通过电影名称获取电影
	public Movie selectByName(String name){
		String director = null;
		String time = null;
		String actors = null;
		String moviedescribe = null;
		String content = null;
		float score=0;
		long boxoffice=0;
		String addsql="select * from movielist where name= '"+name+"';";
		try {
			ResultSet set=connection.prepareStatement(addsql).executeQuery();
			while(set.next()){
				director=set.getString("director");
				time=set.getString("time");
				actors=set.getString("actors");
				moviedescribe=set.getString("moviedesvribe");
				content=set.getString("content");
				score=set.getFloat("score");
				boxoffice=set.getLong("boxoffice");
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Movie(name, director, time, actors, moviedescribe, content,score,boxoffice);
	}
	
	public HashSet<Movie> selectAll(){
		HashSet<Movie> movies=new HashSet<Movie>();
		String name=null;
		String director = null;
		String time = null;
		String actors = null;
		String moviedescribe = null;
		String content = null;
		float score=0;
		long boxoffice=0;
		String addsql="select * from movielist;";
		try {
			ResultSet set=connection.prepareStatement(addsql).executeQuery();
			while(set.next()){
				name=set.getString("name");
				director=set.getString("director");
				time=set.getString("time");
				actors=set.getString("actors");
				moviedescribe=set.getString("moviedescribe");
				content=set.getString("content");
				score=set.getFloat("score");
				boxoffice=set.getLong("boxoffice");
				movies.add(new Movie(name, director, time, actors, moviedescribe, content,score,boxoffice));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
	
	
}
