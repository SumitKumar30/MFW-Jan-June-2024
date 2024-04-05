package org.ncu.movie_app_v1.dao;

import java.util.List;

import org.ncu.movie_app_v1.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class MovieDaoImpl implements MovieDao {
	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void saveMovie(Movie movie) {
		entityManager.persist(movie);
//		return null;
	}

	@Override
	@Transactional
	public Movie getMovieById(int movieId) {
		return entityManager.find(Movie.class, movieId);
//		return null;
	}

	@Override
	@Transactional
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String updateMovieById(int movieId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String deleteMovieById(int movieId) {
		// TODO Auto-generated method stub
		return null;
	}

}
