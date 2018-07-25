package com.lzp.eshop.inventory.controller;

import com.lzp.eshop.inventory.model.User;
import com.lzp.eshop.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.findUserInfo();
        return user;
    }

    @RequestMapping("/getCacheUserInfo")
    @ResponseBody
    public User getCacheUserInfo() {
        User user = userService.findCacheUserInfo();
        return user;
    }
}
