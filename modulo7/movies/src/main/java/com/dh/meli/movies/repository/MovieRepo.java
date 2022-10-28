package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface MovieRepo extends CrudRepository<Movie, Long> {
    //List<Movie> findMoviesByActorsR
     // List<Movie> findMoviesByActorsRatingGreaterThan (BigDecimal rating);
    //List<Movie> findMoviesByActorsRa
    @Query(value = "SELECT movies.id, movies.awards, movies.created_at, movies.length, movies.rating, movies.release_date, movies.title, movies.updated_at FROM actors" +
            " inner join actor_movie on actors.id = actor_movie.actor_id" +
            " inner join movies on movies.id = actor_movie.movie_id" +
            " where actors.rating > ?1", nativeQuery = true)
    List<Movie> findMoviesByActorsRatingGreaterThan (BigDecimal rating);

    Movie findMovieByTitle (String title);
}
