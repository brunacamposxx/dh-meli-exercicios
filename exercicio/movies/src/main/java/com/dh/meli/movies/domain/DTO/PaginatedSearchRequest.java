package com.dh.meli.movies.domain.DTO;

import lombok.Data;

@Data
public class PaginatedSearchRequest {
    private Integer initialPage;
    private Integer pageSize;
}
