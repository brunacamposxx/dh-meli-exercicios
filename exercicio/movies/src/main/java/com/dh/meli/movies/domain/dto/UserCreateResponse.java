package com.dh.meli.movies.domain.dto;

import com.dh.meli.movies.domain.entity.User;
import lombok.Data;

@Data
public class UserCreateResponse {
    private Long id;
    private String name;
    private String username;

    public UserCreateResponse(User newUser) {
        this.id = newUser.getId();
        this.name = newUser.getName();
        this.username = newUser.getUsername();
    }
}