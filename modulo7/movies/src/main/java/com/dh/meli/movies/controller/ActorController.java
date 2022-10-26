package com.dh.meli.movies.controller;

import com.dh.meli.movies.model.Actor;
import com.dh.meli.movies.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService service;

    @GetMapping("/favorite-movie")
    public ResponseEntity<List<Actor>> findActorsFavoriteMovie() {
        List<Actor> actorList = service.findFavoriteMovie();
        return ResponseEntity.ok(actorList);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Actor>> getAll() {
        List<Actor> actorList = service.getAll();
        return ResponseEntity.ok(actorList);
    }

    @GetMapping("/rating-greater-than/{rating}")
    public ResponseEntity<List<Actor>> getActorsByRatingGreaterThan(@PathVariable BigDecimal rating) {
        List<Actor> actorList = service.findActorsByRatingGreaterThan(rating);
        return ResponseEntity.ok(actorList);
    }

}
