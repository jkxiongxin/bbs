package com.example.demo.jpa.repository;

import com.example.demo.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/3 0003.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByName(String name);

    List<User> findAll();

}
