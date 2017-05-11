package com.whh.cosplay.service.impl;

import com.whh.cosplay.bean.User;
import com.whh.cosplay.dao.IUserDao;
import com.whh.cosplay.service.IUserService;
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
