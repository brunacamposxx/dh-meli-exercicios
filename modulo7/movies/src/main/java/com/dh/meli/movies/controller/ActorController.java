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

    @GetMapping
    public ResponseEntity<List<Actor>> getAll(){
        List<Actor> newActor = service.getAll();
        return ResponseEntity.ok(newActor);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Actor>> getAllActors(){
        List<Actor> newActor = service.getAllActors();
        return ResponseEntity.ok(newActor);
    }

    @GetMapping("/rating-grater-than/{gratterThan}")
    public ResponseEntity<List<Actor>> getActorsByRatingGraterThan(@PathVariable BigDecimal gratterThan) {
        List<Actor> newActor = service.getActorsByRatingGraterThan(gratterThan);
        return ResponseEntity.ok(newActor);
    }

}
