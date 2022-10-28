package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Movie;

import java.util.List;

public interface IGenreService {

    List<Movie> findMoviesByGenre(String genre);
}
