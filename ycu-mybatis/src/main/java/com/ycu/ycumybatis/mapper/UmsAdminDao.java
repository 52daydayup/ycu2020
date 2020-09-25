package com.ycu.ycumybatis.mapper;

import com.ycu.ycumybatis.model.UmsAdmin;

public interface UmsAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    UmsAdmin Login(UmsAdmin umsAdmin);

}