package com.huike.ycuweb.repository;

import com.huike.ycuweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Long> {

    /*根据id查询用户*/
    User findById(long id);

    /*根据id删除用户*/
    void deleteById(Long id);
}
