package com.dh.meli.tutoriais.service;

import com.dh.meli.tutoriais.exception.InvalidParamException;
import com.dh.meli.tutoriais.model.Status;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.repository.TutorialRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TutorialService implements ITutorialService {

    private final TutorialRepo repo;

    @Override
    public Tutorial insert(Tutorial tutorial) {
        if(tutorial == null) {
            throw new InvalidParamException("O tutorial não pode ser nulo");
        }
        if(tutorial.getId() != null) {
            throw new InvalidParamException("O tutorial não pode ter id");
        }
        tutorial.setStatus(Status.DRAFT);
        return repo.save(tutorial);
    }

    @Override
    public List<Tutorial> getAll() {
        return null;
    }

    @Override
    public Optional<Tutorial> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Tutorial update(Tutorial tutorial) {
        if(tutorial == null) {
            throw new InvalidParamException("O tutorial não pode ser nulo");
        }
        if(tutorial.getId() == null) {
            throw new InvalidParamException("O tutorial deve ter um id");
        }
        return repo.save(tutorial);
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Tutorial> getPublished() {
        return null;
    }

    @Override
    public List<Tutorial> getByTitle(String title) {
        return repo.findByTitleContaining(title);
    }
}
