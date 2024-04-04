package org.ncu.movie_app_v1.dao;

import java.util.List;

import org.ncu.movie_app_v1.entity.Movie;

public interface MovieDao {
	public void saveMovie(Movie movie);
	public Movie getMovieById(int movieId);
	public List<Movie> getAllMovies();
	public String updateMovieById(int movieId);
	public String deleteMovieById(int movieId);
}
