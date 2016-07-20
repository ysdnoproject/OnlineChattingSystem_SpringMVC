package com.yuanshidong.chat.dao.impl;

import com.yuanshidong.chat.dao.IUserDao;
import com.yuanshidong.chat.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by yuanshidong on 16/7/19.
 */
public class UserDaoImpl implements IUserDao{
    private IUserDao iUserDao;

    public User findbyId(int userId) {

        User user = iUserDao.findbyId(userId);

        return user;
    }
}
