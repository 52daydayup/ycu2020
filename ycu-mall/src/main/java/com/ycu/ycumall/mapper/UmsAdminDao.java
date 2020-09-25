package com.ycu.ycumall.mapper;

import com.ycu.ycumall.model.UmsAdmin;

import java.util.List;

public interface UmsAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    UmsAdmin Login(UmsAdmin umsAdmin);

    List<UmsAdmin> findAll();

    UmsAdmin selectByUsername(UmsAdmin umsAdmin);
}