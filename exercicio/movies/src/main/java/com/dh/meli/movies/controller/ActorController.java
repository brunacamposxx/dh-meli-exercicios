package com.dh.meli.movies.controller;


import com.dh.meli.movies.domain.DTO.ActorPagebleResponse;
import com.dh.meli.movies.domain.DTO.PaginatedSearchRequest;
import com.dh.meli.movies.domain.DTO.ResponseBase;
import com.dh.meli.movies.domain.entity.Actor;
import com.dh.meli.movies.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private IActorService actorService;

    @GetMapping
    public ResponseEntity<List<Actor>> getAllActors() {
        return ResponseEntity.ok(actorService.getAll());
    }

    @GetMapping("/paginated")
    public ResponseEntity getAllPaginatedSearch(PaginatedSearchRequest searchRequest) {
        ResponseBase<Page<ActorPagebleResponse>> retorno = actorService.getAllPaginatedSearch(searchRequest);
        return ResponseEntity.ok(retorno);
    }
}
