package com.ycu.ycumybatis.web;

import com.ycu.ycumybatis.mapper.CustomerMapper;
import com.ycu.ycumybatis.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerCotroller {

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping("/getCustomers")
    public List<Customer>  getCustomers(){
        List<Customer> customers = this.customerMapper.getAll();

        return customers;
    }

    @RequestMapping("/getCustomer")
    public Customer getCustomer(Integer id){
        Customer customer = this.customerMapper.getOne(id);
        return customer;
    }

    @RequestMapping("/add")
    public void save(Customer customer){
        this.customerMapper.insert(customer);
    }

    @RequestMapping("/update")
    public void update(Customer customer){
        this.customerMapper.update(customer);
    }
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        this.customerMapper.delete(id);
    }

}
