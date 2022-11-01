package com.dh.meli.movies.domain.DTO;

import com.dh.meli.movies.domain.entity.Actor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActorPagebleResponse {
    private Long id;
    private String name;
    private BigDecimal rating;
    private Integer favoriteMovieId;

    public ActorPagebleResponse(Actor actor) {
        this.id = actor.getId();
        this.name = actor.getFirstName() + " " + actor.getLastName();
        this.rating = actor.getRating();
        this.favoriteMovieId = actor.getFavoriteMovieId();
    }
}
