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
    @Query(value = "SELECT * FROM movies_db.actors" +
            " inner join movies_db.actor_movie on actors.id = movies_db.actor_movie.actor_id" +
            " inner join movies_db.movies on movies.id = movies_db.actor_movie.movie_id" +
            " where movies_db.actors.rating > ?1", nativeQuery = true)
    List<Movie> findMoviesByActorsRatingGreaterThan (BigDecimal rating);
}
