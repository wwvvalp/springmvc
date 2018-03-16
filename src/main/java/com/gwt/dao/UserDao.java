package com.gwt.dao;

import com.gwt.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    List<User> findUser();
}
