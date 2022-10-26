package com.dh.meli.movies.controller;

import com.dh.meli.movies.model.Actors;
import com.dh.meli.movies.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService service;

    @GetMapping
    public ResponseEntity<List<Actors>> getAll(){
        List<Actors> newActor = service.getAll();
        return ResponseEntity.ok(newActor);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Actors>> getAllActors(){
        List<Actors> newActor = service.getAllActors();
        return ResponseEntity.ok(newActor);
    }





}
