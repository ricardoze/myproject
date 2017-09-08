package web.gc.service;

import java.util.HashSet;

import web.gc.dao.MovieDao;
import web.gc.domain.Movie;

public class MovieService {
	private MovieDao movieDao;
	
	public MovieService() {
		movieDao=new MovieDao();
		movieDao.ConnectSql();
	}
	public boolean addMovie(Movie movie) {
		
		if (movieDao.addMovie(movie)!=0) {
			return true;
		}
		return false;
	}
	public HashSet<Movie> selectAll(){
		return movieDao.selectAll();
	}
	
}
