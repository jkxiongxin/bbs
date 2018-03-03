package com.example.demo.jpa.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户类
 * date: Create on 下午 22:09 2018/3/3 0003
 *
 * @author 熊鑫(Sean)
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private Long role;

    private String icon;

}
