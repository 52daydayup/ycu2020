package com.ycu.ycumall;


import com.ycu.ycumall.mapper.UmsAdminDao;
import com.ycu.ycumall.model.UmsAdmin;
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
    public void insertTest(){
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setUsername("小福贵");
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setNickName("小太监");
        umsAdmin.setPassword("123456");
        umsAdminDao.insert(umsAdmin);
    }

    @Test
    public void deleteTest(){
        this.umsAdminDao.deleteByPrimaryKey(10L);
    }

    @Test
    public void updateTest(){
        UmsAdmin umsAdmin = umsAdminDao.selectByPrimaryKey(11L);
        umsAdmin.toString();
        umsAdmin.setUsername("大富贵");
        umsAdminDao.updateByPrimaryKey(umsAdmin);
    }

    @Test
    public void findAll(){
        UmsAdmin admin = this.umsAdminDao.selectByPrimaryKey(11L);
        System.out.println(admin.toString());

    }
}
