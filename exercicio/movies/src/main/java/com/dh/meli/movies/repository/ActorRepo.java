package com.dh.meli.movies.repository;

import com.dh.meli.movies.domain.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepo extends JpaRepository<Actor, Long> {
}
