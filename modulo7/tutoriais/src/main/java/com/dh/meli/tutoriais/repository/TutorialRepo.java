package com.dh.meli.tutoriais.repository;

import com.dh.meli.tutoriais.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByTitleContaining(String title);
}

