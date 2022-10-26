package com.dh.meli.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "title", nullable = false, length = 500)
    private String title;

    @Column(name = "awards", columnDefinition = "INT UNSIGNED not null")
    private Long awards;

    @Column(name = "release_date", nullable = false)
    private Instant releaseDate;

    @Column(name = "length", columnDefinition = "INT UNSIGNED")
    private Long length;

//    @Column(name = "rating", columnDefinition = "DECIMAL(3, 1) UNSIGNED not null")
//    private BigDecimal ratingMovie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "favorite_movie_id", columnDefinition = "INT UNSIGNED not null")
    private Long favoriteMovieId;

    @OneToMany(mappedBy = "favoriteMovie")
    @JsonIgnoreProperties("favoriteMovie")
    private Set<Actor> actors = new LinkedHashSet<>();
    @OneToMany(mappedBy = "movie")
    private Set<ActorMovie> actorMovies = new LinkedHashSet<>();

/*
    TODO [JPA Buddy] create field to map the 'rating' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rating", columnDefinition = "DECIMAL(3, 1) UNSIGNED not null")
    private Object rating;
*/
//####FALTAM 18 MIN PARA BATER O PONTO

}

