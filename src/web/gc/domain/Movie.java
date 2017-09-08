package web.gc.domain;

public class Movie {
	private String name;
	private String director;
	private String time;
	private String actors;
	private String moviedescribe ;
	private String content ;
	private float score;
	private long boxoffice;
	/*
	 * CREATE DATABASE gc DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
		create table movielist(
			id int auto_increment,
			primary key (id),
			name varchar(20),
			director varchar(20),
			time varchar(20),
			actors TEXT,
			moviedescribe TEXT,
			content TEXT)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
		
	≤È—Ø«∞set names gbk;
		
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getMoviedescribe() {
		return moviedescribe;
	}
	public void setMoviedescribe(String moviedescribe) {
		this.moviedescribe = moviedescribe;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public long getBoxoffice() {
		return boxoffice;
	}
	public void setBoxoffice(long boxoffice) {
		this.boxoffice = boxoffice;
	}
	public Movie(String name, String director, String time, String actors, String moviedescribe, String content,
			float score, long boxoffice) {
		super();
		this.name = name;
		this.director = director;
		this.time = time;
		this.actors = actors;
		this.moviedescribe = moviedescribe;
		this.content = content;
		this.score = score;
		this.boxoffice = boxoffice;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", director=" + director + ", time=" + time + ", actors=" + actors
				+ ", moviedescribe=" + moviedescribe + ", content=" + content + ", score=" + score + ", boxoffice="
				+ boxoffice + "]";
	}
	
	
	
}
