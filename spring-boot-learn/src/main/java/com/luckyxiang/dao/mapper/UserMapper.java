package com.luckyxiang.dao.mapper;

import com.luckyxiang.dao.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from m_user")
    List<User> findAll();
}
