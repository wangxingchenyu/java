package com.zhileiedu.service.impl;

import com.zhileiedu.dao.impl.UserDaoImpl;
import com.zhileiedu.pojo.User;
import com.zhileiedu.service.UserInterface;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserInterface {
    @Override
    public List<User> show() throws SQLException, ClassNotFoundException {
         List<User> users = new UserDaoImpl().selAll();
         return users;
    }

}
