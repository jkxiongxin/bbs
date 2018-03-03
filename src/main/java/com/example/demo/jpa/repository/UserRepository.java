package com.example.demo.jpa.repository;

import com.example.demo.jpa.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据操作类
 * date: Create on 下午 22:09 2018/3/3 0003
 *
 * @author 熊鑫(Sean)
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByName(String name);

    List<User> findAll();

}
