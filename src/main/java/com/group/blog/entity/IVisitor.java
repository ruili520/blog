package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 访客实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_visitor")
public class IVisitor {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * 访客人数
     */
    private long visitorNum;

    /**
     * 当前页的name or 文章名
     */
    private String pageName;
}
