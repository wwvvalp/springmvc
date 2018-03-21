package com.gwt.service;

import com.gwt.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findUser();

    User getUserById(Integer id);

    void addUser(User user);
}
