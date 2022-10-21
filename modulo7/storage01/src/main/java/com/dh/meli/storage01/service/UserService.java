package com.dh.meli.storage01.service;

import com.dh.meli.storage01.model.UserBD;
import com.dh.meli.storage01.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public UserBD insert(UserBD user) {
        return repo.save(user);
    }

    public Optional<UserBD> findById(long cod) {
        return repo.findById(cod);
    }

    public UserBD update(UserBD user) {
        return repo.save(user);
    }

    public void delete(long cod) {
        repo.deleteById(cod);
    }

}
