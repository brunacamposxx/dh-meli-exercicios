package com.dh.meli.movies.service;

import com.dh.meli.movies.domain.DTO.ActorPagebleResponse;
import com.dh.meli.movies.domain.DTO.PaginatedSearchRequest;
import com.dh.meli.movies.domain.DTO.ResponseBase;
import com.dh.meli.movies.domain.entity.Actor;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IActorService {
    List<Actor> getAll();
    ResponseBase<Page<ActorPagebleResponse>> getAllPaginatedSearch(PaginatedSearchRequest searchRequest);

}
