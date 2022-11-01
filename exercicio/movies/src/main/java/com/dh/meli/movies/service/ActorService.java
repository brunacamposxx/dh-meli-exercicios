package com.dh.meli.movies.service;

import com.dh.meli.movies.domain.entity.Actor;
import com.dh.meli.movies.repository.ActorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService implements IActorService {

    private final ActorRepo repo;
    @Override
    public List<Actor> getAll() {
        return repo.findAll();
    }
}
