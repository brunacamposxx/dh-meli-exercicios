package com.dh.meli.movies.controller;

import com.dh.meli.movies.domain.dto.GetUsersResponse;
import com.dh.meli.movies.domain.dto.UserCreateRequest;
import com.dh.meli.movies.domain.dto.UserCreateResponse;
import com.dh.meli.movies.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @RolesAllowed("ADMIN_USER")
    @GetMapping
    public List<GetUsersResponse> getUsers(){
        return userService.getAllUsers();
    }

    @Secured("ROLE_ADMIN_USER")
    @PostMapping
    public ResponseEntity<UserCreateResponse> create(@Valid @RequestBody UserCreateRequest postModel){
        UserCreateResponse returning = userService.create(postModel);
        return ResponseEntity.ok(returning);
    }
}