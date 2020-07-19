package com.haojie.service;

import javax.annotation.Resource;

import com.haojie.dao.UsersDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
public class UserService {
    @Resource
    private UsersDAO userDao;

    @Transactional
    public int userCount() {
        return userDao.getAllUser().size();
    }

    public UsersDAO getUserDao() {
        return userDao;
    }

    public void setUserDao(UsersDAO userDao) {
        this.userDao = userDao;
    }

}
