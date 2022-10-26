package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Long> {
}
