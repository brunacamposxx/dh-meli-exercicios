package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Movie;

import java.math.BigDecimal;
import java.util.List;

public interface IMovieService {

    List<Movie> findMoviesByMovieActors(BigDecimal rating);
}
