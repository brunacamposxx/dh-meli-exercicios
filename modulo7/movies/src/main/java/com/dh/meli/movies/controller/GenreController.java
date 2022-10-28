package com.dh.meli.movies.controller;

import com.dh.meli.movies.model.Movie;
import com.dh.meli.movies.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService service;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getMoviesByGenre(@RequestParam String genre) {
        List<Movie> movieList = service.findMoviesByGenre(genre);
        return ResponseEntity.ok(movieList);
    }
}
