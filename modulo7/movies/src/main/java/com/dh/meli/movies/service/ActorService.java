package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Actors;
import com.dh.meli.movies.repository.ActorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {
    private final ActorRepo repo;

    public List<Actors> getAll() {
        return repo.findActorsByFavoriteMovieIdNotNull();
    }

    public List<Actors> getAllActors() {
        return repo.findAll();
    }

    public List<Actors> getActorsByRatingGraterThan(BigDecimal gratterThan) {
        return repo.findActorsByRatingGreaterThan(gratterThan);
    }
}
