package com.dh.meli.movies.repository;

import com.dh.meli.movies.domain.entity.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.util.List;


@Repository
public interface ActorRepo extends PagingAndSortingRepository<Actor, Long> {
//    List<Actor> findAllByRatingGreaterThan(BigDecimal rating, Pageable pageable);
}
