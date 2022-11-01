package com.dh.meli.movies.domain.dto;

import com.dh.meli.movies.domain.entity.Role;
import com.dh.meli.movies.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetUsersResponse {
    private Long id;
    private String name;
    private String username;
    private List<Role> roles;
    public GetUsersResponse(User newUser) {
        this.id = newUser.getId();
        this.name = newUser.getName();
        this.username = newUser.getUsername();
        this.roles = newUser.getRoles();
    }
}