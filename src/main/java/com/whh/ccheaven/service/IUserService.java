package com.whh.ccheaven.service;

import com.whh.ccheaven.bean.User;

import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description
 */
public interface IUserService extends IBaseService {
    List<User> findAll();
}
