
package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ActorRepo extends JpaRepository<Actor, Long> {
    List<Actor> findActorsByMovieNotNull ();
    List<Actor> findActorsByRatingActorGreaterThan (BigDecimal rating);
//    List<Actor> findAll ();
}
