package com.ycu.ycumybatis.service.impl;

import com.ycu.ycumybatis.mapper.UmsAdminDao;
import com.ycu.ycumybatis.model.UmsAdmin;
import com.ycu.ycumybatis.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UmsAdminDao adminDao;
    @Override
    public UmsAdmin login(UmsAdmin umsAdmin) {

        return this.adminDao.Login(umsAdmin);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        this.adminDao.deleteByPrimaryKey(id);
    }


}
