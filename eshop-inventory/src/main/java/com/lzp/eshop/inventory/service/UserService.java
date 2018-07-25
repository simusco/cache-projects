package com.lzp.eshop.inventory.service;

import com.lzp.eshop.inventory.model.User;

/**
 *
 * @author lzp
 */
public interface UserService {

    public User findUserInfo();

    public User findCacheUserInfo();
}
