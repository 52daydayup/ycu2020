package com.ycu.ycumybatis;


import com.ycu.ycumybatis.mapper.CustomerMapper;
import com.ycu.ycumybatis.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;
    //插入测试
    @Test
    public void testInsert()throws Exception{
        this.customerMapper.insert(new Customer("张三丰","123456","男"));
        this.customerMapper.insert(new Customer("赵子龙","123456","男"));
        this.customerMapper.insert(new Customer("貂蝉","123456","女"));

        Assert.assertEquals(3,this.customerMapper.getAll().size());
    }
    //查询测试
    @Test
    public void getAllTest()throws Exception{
        List<Customer> customers = this.customerMapper.getAll();
        if(customers==null||customers.size()==0){
            System.out.println("没有数据");
        }else{
            System.out.println(customers.toString());
        }
    }
    //更新测试
    @Test
    public void testUpdate(){
        Customer customer = customerMapper.getOne( 1);

        customer.setNickName("尼奥");

        this.customerMapper.update(customer);

        Assert.assertTrue("尼奥".equals(this.customerMapper.getOne(1).getNickName()));
    }



}
