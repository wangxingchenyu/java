package com.zhileiedu.service;

import com.zhileiedu.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserInterface {
    List<User> show() throws SQLException, ClassNotFoundException;
}
