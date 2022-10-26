package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.Migration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MigrationRepo extends JpaRepository<Migration, Long> {
}
