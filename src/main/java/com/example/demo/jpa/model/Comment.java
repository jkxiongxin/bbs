package com.example.demo.jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 评论类
 * date: Create on 下午 22:10 2018/3/3 0003
 *
 * @author 熊鑫(Sean)
 */
@Data
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private Timestamp createTime;

}
