package com.whh.ccheaven.service;

import com.whh.ccheaven.bean.user.User;

import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description
 */
public interface IListService extends IBaseService {
    List<User> findAll();
}
