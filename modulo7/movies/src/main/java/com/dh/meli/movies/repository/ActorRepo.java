package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Long> {
    List<Actor> findActorsByFavoriteMovieIdNotNull();
    List<Actor> findActorsByRatingGreaterThan(BigDecimal gratterThan);

//    List<Actors> findActorsBy
}








