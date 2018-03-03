package com.example.demo.jpa.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 帖子
 * date: Create on 下午 22:09 2018/3/3 0003
 *
 * @author 熊鑫(Sean)
 */
@Entity
@Table(name = "posting")
public class Posting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp createTime;

    private String content;

}
