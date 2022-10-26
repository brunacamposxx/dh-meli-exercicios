package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Actor;
import com.dh.meli.movies.repository.ActorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService implements IActorService{

    private final ActorRepo repo;

    @Override
    public List<Actor> findFavoriteMovie() {
        List<Actor> actorList = repo.findActorsByMovieNotNull();
        return actorList;
    }

    @Override
    public List<Actor> getAll() {
        List<Actor> actorList = repo.findAll();
        return actorList;
    }

    @Override
    public List<Actor> findActorsByRatingGreaterThan(BigDecimal rating) {
        List<Actor> actorList = repo.findActorsByRatingGreaterThan(rating);
        return actorList;
    }


}
