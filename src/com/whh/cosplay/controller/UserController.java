package com.whh.cosplay.controller;

import com.whh.cosplay.bean.User;
import com.whh.cosplay.service.IUserService;
import com.whh.cosplay.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author weiwhite on 5/10/17.
 * @description
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
        return "/all_user";
    }

}
