package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
