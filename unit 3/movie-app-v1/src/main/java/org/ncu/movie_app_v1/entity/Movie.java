package org.ncu.movie_app_v1.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_table")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	@Column(length = 20, nullable = false, unique = true)
	private String movieName;
	@Column(nullable = false)
	private double movieRating;
	@Column(length = 10, nullable = false)
	private String genre;
	@Column(length = 50, nullable = true)
	private String movieDetails;
	@Column(nullable = false)
	private LocalDate releaseYear;
	
	Movie(){}

	public Movie(String movieName, double movieRating, String genre, String movieDetails,
			LocalDate releaseYear) {
		super();
//		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.genre = genre;
		this.movieDetails = movieDetails;
		this.releaseYear = releaseYear;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(String movieDetails) {
		this.movieDetails = movieDetails;
	}

	public LocalDate getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(LocalDate releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating + ", genre="
				+ genre + ", movieDetails=" + movieDetails + ", releaseYear=" + releaseYear + "]";
	}
	
}
