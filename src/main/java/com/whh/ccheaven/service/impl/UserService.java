package com.whh.ccheaven.service.impl;

import com.whh.ccheaven.bean.user.User;
import com.whh.ccheaven.dao.IUserDao;
import com.whh.ccheaven.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description
 */
@Service
public class UserService extends BaseService implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
