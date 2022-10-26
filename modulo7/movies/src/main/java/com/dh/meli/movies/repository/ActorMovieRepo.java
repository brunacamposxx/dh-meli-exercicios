package com.dh.meli.movies.repository;


import com.dh.meli.movies.model.ActorMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorMovieRepo extends JpaRepository<ActorMovie, Long> {
}
