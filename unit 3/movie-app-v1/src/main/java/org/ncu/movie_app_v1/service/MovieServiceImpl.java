package org.ncu.movie_app_v1.service;

import org.ncu.movie_app_v1.dao.MovieDao;
import org.ncu.movie_app_v1.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieDao movieDao;
	
	@Override
	public String createMovie(Movie movie) {
		movieDao.saveMovie(movie);
		return "Movie save successfully!!!";
	}

	@Override
	public String findMovieById(int movieId) {
		Movie m = movieDao.getMovieById(movieId);
		if(m == null)
			return "Record not found!!!";
		else
			return "Record found: "+m;
	}

}
