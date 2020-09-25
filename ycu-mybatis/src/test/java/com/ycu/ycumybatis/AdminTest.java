package com.ycu.ycumybatis;


import com.ycu.ycumybatis.mapper.UmsAdminDao;
import com.ycu.ycumybatis.model.UmsAdmin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
    @Autowired
    private UmsAdminDao umsAdminDao;

    @Test
    public void insertAdminTest(){
        UmsAdmin admin = new UmsAdmin();
        admin.setNickName("哈哈");
        admin.setCreateTime(new Date());
        admin.setPassword("123456");
        admin.setUsername("张三");

        this.umsAdminDao.insertSelective(admin);
    }

    @Test
    public void deleteTest(){
        this.umsAdminDao.deleteByPrimaryKey(1L);
    }
}
