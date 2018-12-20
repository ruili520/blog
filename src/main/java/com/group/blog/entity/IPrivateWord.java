package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 悄悄话实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_privateword")
public class IPrivateWord {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * 悄悄话内容
     */
    private String privateWord;

    /**
     * 发布者
     */
    private String publisherId;

    /**
     * 回复者
     */
    private String  replierId;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 发布时间
     */
    private String publisherDate;
}
