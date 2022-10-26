package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<Series, Long> {
}
