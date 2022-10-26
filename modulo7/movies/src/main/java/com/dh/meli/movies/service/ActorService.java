package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Actor;
import com.dh.meli.movies.repository.ActorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {
    private final ActorRepo repo;

    public List<Actor> getAll() {
        return repo.findActorsByFavoriteMovieIdNotNull();
    }

    public List<Actor> getAllActors() {
        return repo.findAll();
    }

    public List<Actor> getActorsByRatingGraterThan(BigDecimal gratterThan) {
        return repo.findActorsByRatingGreaterThan(gratterThan);
    }
}
