package com.dh.meli.storage01.repository;

import com.dh.meli.storage01.model.UserBD;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserBD, Long> {

}
