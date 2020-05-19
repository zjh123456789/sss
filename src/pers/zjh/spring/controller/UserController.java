package pers.zjh.spring.controller;

import pers.zjh.spring.service.UserService;

/**
 * {todo}
 *
 * @author jinghui.zhu
 * @createTime 2020/4/29 20:12
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
