package com.huike.ycuweb.service;

import com.huike.ycuweb.model.User;

import java.util.List;

public interface UserService {
    /* 获取所有用户信息*/
    List<User> qetUserList();

    /* 根据用户id查询用户*/
    User findUserById(long id);

    /*保存用户*/
    void save(User user);

    /*编辑用户*/
    void edit(User user);

    /*删除用户*/
    void delete(Long id);


}
