package com.zhileiedu.dao.impl;

import com.zhileiedu.dao.UserDao;
import com.zhileiedu.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    List<User> users = new ArrayList<>();

    @Override
    public List<User> selAll() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdjk", "root", "kkk");
        preparedStatement = connection.prepareStatement("select * from jdjk_com");
        resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet.toString());

        while (resultSet.next()) {
            users.add(new User(resultSet.getInt("id"), resultSet.getString("yewu"), resultSet.getString("diyiname")));
        }

        /**
         * 返回一个用户对象的列表
         */
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return users;
    }
}
