package com.dh.meli.movies.controller;

import com.dh.meli.movies.model.Movie;
import com.dh.meli.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/rating-greater-than/{rating}")
    public ResponseEntity<List<Movie>> getMoviesByRatingGreaterThan(@PathVariable BigDecimal rating) {
        List<Movie> movieList = service.findMoviesByActorsRatingGreaterThan(rating);
        return ResponseEntity.ok(movieList);
    }
}
