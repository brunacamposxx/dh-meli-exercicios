package com.dh.meli.movies.repository;

import com.dh.meli.movies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
