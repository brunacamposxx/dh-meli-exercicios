package com.dh.meli.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @Column(name = "created_at")
    @JsonIgnore
    private Instant createdAt;

    @Column(name = "updated_at")
    @JsonIgnore
    private Instant updatedAt;

    @Column(name = "title", nullable = false, length = 500)
    private String title;

    @Column(name = "awards", columnDefinition = "INT UNSIGNED not null")
    private Long awards;

    @Column(name = "release_date", nullable = false)
    private Instant releaseDate;

    @Column(name = "length", columnDefinition = "INT UNSIGNED")
    private Long length;

    @Column(name = "rating", precision = 3, scale = 1)
    private BigDecimal rating;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "genre_id")
//    private Genre genre;

    /*
    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    @JsonIgnore
    @JsonIgnoreProperties("movie")
    private List<Actor> actor; */

    @ManyToMany(mappedBy = "movies")
    @JsonIgnoreProperties("movies")
    private Set<Actor> actors;
}
