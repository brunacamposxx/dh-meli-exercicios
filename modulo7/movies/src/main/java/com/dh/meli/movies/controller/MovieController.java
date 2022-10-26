package com.dh.meli.movies.controller;

import com.dh.meli.movies.model.Movie;
import com.dh.meli.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService service;


    @GetMapping("/rating/{rating}")
    public ResponseEntity<List<Movie>> getMovie(@PathVariable BigDecimal rating){
        return new ResponseEntity(service.findMoviesByMovieActors(rating), HttpStatus.OK);
    }
}
