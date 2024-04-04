package org.ncu.movie_app_v1.controller;

import org.ncu.movie_app_v1.entity.Movie;
import org.ncu.movie_app_v1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieapp-v1")
public class MovieController {
	@Autowired
	MovieService movieService;
	
	@PostMapping("/save")
	public String saveMovieData(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
}
