package com.parma.servicediscovery.poc.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parma.servicediscovery.poc.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("{movieId}")
	public Movie  getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie("101", "Bala");
	}
}
