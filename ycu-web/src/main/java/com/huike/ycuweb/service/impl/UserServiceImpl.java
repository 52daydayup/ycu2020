package com.huike.ycuweb.service.impl;

import com.huike.ycuweb.model.User;
import com.huike.ycuweb.repository.UserDao;
import com.huike.ycuweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> qetUserList() {
        return this.userDao.findAll();
    }

    @Override
    public User findUserById(long id) {
        return this.userDao.findById(id);
    }

    @Override
    public void save(User user) {
        this.userDao.save(user);
    }

    @Override
    public void edit(User user) {
        this.userDao.save(user);

    }

    @Override
    public void delete(Long id) {
        this.userDao.deleteById(id);
    }
}
