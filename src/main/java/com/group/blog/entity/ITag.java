package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 标签实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_tags")
public class ITag {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签大小
     */
    private int tagSize;
}
