package com.whh.cosplay.dao;

import com.whh.cosplay.bean.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author weiwhite on 5/10/17.
 * @description
 */
@Repository
@Transactional
public interface IUserDao extends IBaseDao {

    List<User> findAll();

}
