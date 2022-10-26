package com.dh.meli.movies.service;

import com.dh.meli.movies.model.Actor;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.BiConsumer;

public interface IActorService {
    List<Actor> findFavoriteMovie();
    List<Actor> getAll();
    List<Actor> findActorsByRatingGreaterThan(BigDecimal rating);

}
