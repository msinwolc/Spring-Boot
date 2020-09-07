package com.shixun.orderingsystem.service;

import com.shixun.orderingsystem.bean.Administrator;
import com.shixun.orderingsystem.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    @Override
    public String Register(User user) {
        String sql = "insert into user set user_id = ?,user_name = ?,user_password = ?,user_phone = ?,user_address = ?";
        return String.valueOf(jdbcTemplate.update(sql,user.getUserId(),user.getUserName(),user.getUserPassword(),user.getUserPhone(),user.getUserAddress()));
    }

    @Transactional
    @Override
    public User queryUser(User user) {
        String sql = "select * from user where user_name = ? and user_password = ?";
        User selectUser;
        try {
            selectUser = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User u = new User();
                    u.setUserName(resultSet.getNString("user_name"));
                    u.setUserPassword(resultSet.getNString("user_password"));
                    return u;
                }
            }, user.getUserName(), user.getUserPassword());
        }catch (EmptyResultDataAccessException e){
            return null;
        }
        return selectUser;
    }

    @Override
    public Administrator queryUser(Administrator administrator) {
        String sql = "select * from admin where user_name = ? and user_password = ?";
        Administrator selectUser;
        try {
            selectUser = jdbcTemplate.queryForObject(sql, new RowMapper<Administrator>() {
                @Override
                public Administrator mapRow(ResultSet resultSet, int i) throws SQLException {
                    Administrator administrator = new Administrator();
                    administrator.setUserName(resultSet.getNString("user_name"));
                    administrator.setPassword(resultSet.getNString("user_password"));
                    return administrator;
                }
            }, administrator.getUserName(), administrator.getPassword());
        }catch (EmptyResultDataAccessException e){
            return null;
        }
        return selectUser;
    }
}
