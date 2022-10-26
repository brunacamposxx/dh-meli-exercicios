package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepo extends JpaRepository<Episode, Long> {
}
