package com.dh.meli.movies.domain.dto;

import lombok.Data;

@Data
public class PaginatedSearchRequest {
    private Integer initialPage;
    private Integer pageSize;
}
