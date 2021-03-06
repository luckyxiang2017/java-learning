package com.luckyxiang.dao.repository;

import com.luckyxiang.dao.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByEmail(String email);
}
