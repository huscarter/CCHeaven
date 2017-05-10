package com.whh.cosplay.dao;

import com.whh.cosplay.bean.User;

import java.util.List;

/**
 * @author weiwhite on 5/10/17.
 * @description
 */
public interface IUserDao extends IBaseDao {
    void save(User user);

    boolean update(User user);

    boolean delete(int id);

    User findById(int id);

    List<User> findAll();
}
