package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepo extends JpaRepository<Season, Long> {
}
