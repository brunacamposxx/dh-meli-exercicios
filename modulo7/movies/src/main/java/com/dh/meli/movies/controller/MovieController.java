package com.dh.meli.movies.controller;

import com.dh.meli.movies.model.Actor;
import com.dh.meli.movies.model.Movie;
import com.dh.meli.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

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

    @GetMapping("/actors")
    public ResponseEntity<Set<Actor>> getActorsByMovie(@RequestParam String title) {
        Set<Actor> actorList = service.findActorsByMovies(title);
        return ResponseEntity.ok(actorList);
    }
}
