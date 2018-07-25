package com.lzp.eshop.inventory.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lzp.eshop.inventory.dao.RedisDAO;
import com.lzp.eshop.inventory.mapper.UserMapper;
import com.lzp.eshop.inventory.model.User;
import com.lzp.eshop.inventory.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisDAO redisDAO;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public User findCacheUserInfo() {
        redisDAO.set("cache_user_lisi","{\"name\": \"lisi\", \"age\": 25}");

        String json = redisDAO.get("cache_user_lisi");
        JSONObject jsonObject = JSONObject.parseObject(json);

        User user = new User();
        user.setName(jsonObject.getString("name"));
        user.setAge(jsonObject.getInteger("age"));
        return user;
    }
}
