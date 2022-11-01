package com.dh.meli.movies.domain.dto;

import javax.validation.constraints.NotEmpty;

public record WishlistItemRequest(@NotEmpty String description) {
}