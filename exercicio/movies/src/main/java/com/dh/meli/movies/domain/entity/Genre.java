package com.dh.meli.movies.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
@Getter
@Setter
@NoArgsConstructor
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

    @Column(name = "movies_id", columnDefinition = "INT UNSIGNED not null")
    private Long moviesId;

}