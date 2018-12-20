package com.group.blog.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 文章点赞记录实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_article_likes_record")
public class IArticleLikesRecord {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private long id;
    /**
     * 文章id
     */
    private String articleId;
    /**
     * 原作者
     */
    private String originalAuthor;
    /**
     * 点赞人
     */
    private int likerId;
    /**
     * 点赞时间
     */
    private String likeDate;
}
