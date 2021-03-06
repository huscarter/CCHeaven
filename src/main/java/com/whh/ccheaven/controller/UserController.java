package com.whh.ccheaven.controller;

import com.whh.ccheaven.bean.user.User;
import com.whh.ccheaven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author weiwhite on 5/16/17.
 * @description 用户的controller类
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;

    /**
     * 获取所有用户列表
     *
     * @param request
     * @return
     */
    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request) {

        List<User> findAll = userService.findAll();

        request.setAttribute("userList", findAll);
        return "user/all_user";
    }
}
