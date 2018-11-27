package com.zhileiedu.dao;

import com.zhileiedu.pojo.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    List<User> USERS = new ArrayList<>();

    List<User> selAll() throws ClassNotFoundException, SQLException;
}
