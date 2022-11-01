package com.dh.meli.movies.repository;

import com.dh.meli.movies.domain.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WhislistRepository extends JpaRepository<Wishlist, Long> {

    public List<Wishlist> findByUser_id(Long userId);

}