package com.dh.meli.movies.domain.dto;

import javax.validation.constraints.NotEmpty;

public record LoginRequest (@NotEmpty String username, @NotEmpty String password){}