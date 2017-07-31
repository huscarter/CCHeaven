package com.whh.ccheaven.dao;

import com.whh.ccheaven.bean.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description
 */
@Repository
@Transactional
public interface IListDao extends IBaseDao {
    List<User> findAll();
}
