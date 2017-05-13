package com.whh.heaven.service.impl;

import com.whh.heaven.bean.User;
import com.whh.heaven.dao.IUserDao;
import com.whh.heaven.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weiwhite on 5/10/17.
 * @description
 */
@Service()
public class UserService extends BaseService implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
