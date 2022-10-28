package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Actor;
import com.dh.meli.movies.model.Movie;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public interface IMovieService {
    List<Movie> findMoviesByActorsRatingGreaterThan (BigDecimal rating);

    Set<Actor> findActorsByMovies (String title);
}
