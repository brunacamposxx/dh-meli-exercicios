package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Actor;
import com.dh.meli.movies.model.Movie;
import com.dh.meli.movies.repository.MovieRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MovieService implements IMovieService{

    private final MovieRepo repo;

    @Override
    public List<Movie> findMoviesByActorsRatingGreaterThan(BigDecimal rating) {
        return repo.findMoviesByActorsRatingGreaterThan(rating);
    }

    @Override
    public Set<Actor> findActorsByMovies(String title) {
        return repo.findMovieByTitle(title).getActors();
    }


}


