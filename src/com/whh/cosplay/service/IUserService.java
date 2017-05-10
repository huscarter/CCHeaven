package com.whh.cosplay.service;

import com.whh.cosplay.bean.User;

import java.util.List;

/**
 * @author weiwhite on 5/10/17.
 * @description
 */
public interface IUserService extends IBaseService {

    List<User> findAll();
}
