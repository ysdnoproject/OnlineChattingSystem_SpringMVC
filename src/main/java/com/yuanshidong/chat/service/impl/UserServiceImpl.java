package com.yuanshidong.chat.service.impl;

import com.yuanshidong.chat.dao.IUserDao;
import com.yuanshidong.chat.entity.User;
import com.yuanshidong.chat.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yuanshidong on 16/7/19.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        return this.userDao.findbyId(userId);
    }
}
