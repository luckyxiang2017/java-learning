package com.luckyxiang.service.impl;

import com.luckyxiang.dao.mapper.UserMapper;
import com.luckyxiang.dao.model.User;
import com.luckyxiang.dao.repository.UserRepository;
import com.luckyxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(int id) {
        User user = new User();
        jdbcTemplate.query("select * from m_user where id = ?",
                new Object[]{1}, new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        user.setId(rs.getInt("id"));
                        user.setName(rs.getString("name"));
                        user.setEmail(rs.getString("email"));
                    }
                });
        return user;
    }

    @Override
    public List<User> findAllUser() {

        return userMapper.findAll();
    }

    @Override
    public List<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
