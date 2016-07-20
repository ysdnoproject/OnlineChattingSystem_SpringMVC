package com.yuanshidong.chat.dao;

import com.yuanshidong.chat.entity.User;

/**
 * Created by yuanshidong on 16/7/19.
 */
public interface IUserDao {
    public User findbyId(int userId);
}
