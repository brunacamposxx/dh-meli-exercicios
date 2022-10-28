package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Movie;
import com.dh.meli.movies.repository.GenreRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService implements IGenreService {

    private final GenreRepo repo;

    @Override
    public List<Movie> findMoviesByGenre(String genre) {
        return repo.findGenreByName(genre).getMovies();
    }
}


