package com.ycu.ycumall.service.impl;


import com.ycu.ycumall.mapper.UmsAdminDao;
import com.ycu.ycumall.model.UmsAdmin;
import com.ycu.ycumall.result.CodeMsg;
import com.ycu.ycumall.result.Result;
import com.ycu.ycumall.service.AdminService;
import com.ycu.ycumall.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UmsAdminDao adminDao;
//    @Override
//    public UmsAdmin login(UmsAdmin umsAdmin) {
//
//        return this.adminDao.Login(umsAdmin);
//    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        this.adminDao.deleteByPrimaryKey(id);
    }

    @Override
    public Result<UmsAdmin> login(UmsAdmin umsAdmin) {
        UmsAdmin admin =this.adminDao.selectByUsername(umsAdmin);

        if(ObjectUtils.isEmpty(admin)){
            return  Result.error(CodeMsg.USERNAME_NOT_EXISTS);
        }
        //数据库中保存的密码
        String dbPwd = admin.getPassword();
        String saltDB = admin.getSalt();
        //用户输入的密码进行加密
        String calaPass = MD5Util.inputPassToDbPass(umsAdmin.getPassword(),saltDB);

        if(!StringUtils.equals(dbPwd,calaPass)){
            //密码不一致
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
        admin.setPassword(StringUtils.EMPTY);//登录成功时，密码至空
        admin.setSalt(StringUtils.EMPTY);
        return Result.success(admin);
    }

    @Override
    public void insertAdmin(UmsAdmin umsAdmin) {
        this.adminDao.insertSelective(umsAdmin);
    }

    @Override
    public void deleteAdmin(Long id) {
        this.adminDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<UmsAdmin> findAll() {
        List<UmsAdmin> admins = this.adminDao.findAll();
        return admins;
    }

    @Override
    public void upDateAdmin(UmsAdmin admin) {
        this.adminDao.updateByPrimaryKeySelective(admin);
    }

    @Override
    public UmsAdmin findById(Long id) {
        UmsAdmin admin = this.adminDao.selectByPrimaryKey(id);
        return admin;
    }


}
