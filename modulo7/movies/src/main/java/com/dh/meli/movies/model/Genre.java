package com.dh.meli.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "ranking", columnDefinition = "INT UNSIGNED not null")
    private Long ranking;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("genre")
    private List<Movie> movies;
}