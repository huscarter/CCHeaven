package com.whh.cosplay.service.impl;

import com.whh.cosplay.bean.User;
import com.whh.cosplay.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiwhite on 5/10/17.
 * @description
 */
@Service("userService")
public class UserService extends BaseService implements IUserService {

//    @Resource
//    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return new ArrayList<>();
    }
}
