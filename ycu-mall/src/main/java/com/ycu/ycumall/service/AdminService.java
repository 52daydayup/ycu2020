package com.ycu.ycumall.service;

import com.ycu.ycumall.model.UmsAdmin;
import com.ycu.ycumall.result.Result;

import java.util.List;

public interface AdminService {

    //UmsAdmin login(UmsAdmin umsAdmin);

    void deleteByPrimaryKey(Long id);

    //使用用户名和密码登录
    Result<UmsAdmin> login(UmsAdmin umsAdmin);
    //增加admin
    void insertAdmin(UmsAdmin umsAdmin);
    //删除admin
    void deleteAdmin(Long id);
    //查询全部admin
    List<UmsAdmin> findAll();
    //修改用admin信息
    void upDateAdmin(UmsAdmin admin);
    //id查找一条
    UmsAdmin findById(Long id);
}
