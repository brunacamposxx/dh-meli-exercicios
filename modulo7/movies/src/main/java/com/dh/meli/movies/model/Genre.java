package com.dh.meli.movies.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
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

    @OneToMany(mappedBy = "genre")
    private Set<Series> series = new LinkedHashSet<>();

    @OneToMany(mappedBy = "genre")
    private Set<Movie> movies = new LinkedHashSet<>();


}