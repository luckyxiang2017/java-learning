package com.luckyxiang.service;

import com.luckyxiang.dao.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id);

    List<User> findAllUser();
}
