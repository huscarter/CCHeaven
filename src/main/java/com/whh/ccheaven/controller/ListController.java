package com.whh.ccheaven.controller;

import com.whh.ccheaven.bean.list.Comiccon;
import com.whh.ccheaven.bean.list.Composite;
import com.whh.ccheaven.bean.user.User;
import com.whh.ccheaven.service.IListService;
import com.whh.ccheaven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description 各个列表的controller类
 */
@Controller
@RequestMapping("/list")
public class ListController extends BaseController {
    @Autowired
    private IListService listService;

    /**
     * 获取漫展列表
     *
     * @param request
     * @return
     */
    @RequestMapping("/getComicconList")
    public String getComicconList(HttpServletRequest request) {

        List<Comiccon> findAll = listService.findComicconList();

        request.setAttribute("userList", findAll);
        return "list/comiccon";
    }

    /**
     * 获取综合列表
     *
     * @param request
     * @return
     */
    @RequestMapping("/getCompositeList")
    public String getCompositeList(HttpServletRequest request) {

        List<Composite> findAll = listService.findCompositeList();

        request.setAttribute("userList", findAll);
        return "list/composite";
    }
}
