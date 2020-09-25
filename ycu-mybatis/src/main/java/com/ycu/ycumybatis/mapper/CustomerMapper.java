package com.ycu.ycumybatis.mapper;

import com.ycu.ycumybatis.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    List<Customer> getAll();

    void insert(Customer customer);

    void delete(Long id);

    void update(Customer customer);

    Customer getOne(Integer id);
}
