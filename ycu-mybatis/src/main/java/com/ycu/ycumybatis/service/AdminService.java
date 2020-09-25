package com.ycu.ycumybatis.service;

import com.ycu.ycumybatis.model.UmsAdmin;

public interface AdminService {

    UmsAdmin login(UmsAdmin umsAdmin);

    void deleteByPrimaryKey(Long id);
}
