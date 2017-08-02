package com.whh.ccheaven.service;

import com.whh.ccheaven.bean.list.Comiccon;
import com.whh.ccheaven.bean.list.Composite;
import com.whh.ccheaven.bean.user.User;

import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description
 */
public interface IListService extends IBaseService {

    /**
     * 获取漫展列表
     *
     * @return
     */
    List<Comiccon> findComicconList();

    /**
     * 获取综合列表
     *
     * @return
     */
    List<Composite> findCompositeList();
}
