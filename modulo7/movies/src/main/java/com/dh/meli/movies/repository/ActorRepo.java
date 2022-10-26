package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Actors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ActorRepo extends JpaRepository<Actors, Long> {
    List<Actors> findActorsByFavoriteMovieIdNotNull();
    List<Actors> findActorsByRatingGreaterThan(BigDecimal gratterThan);
}








