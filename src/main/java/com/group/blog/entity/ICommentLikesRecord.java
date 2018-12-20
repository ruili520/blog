package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 文章评论点赞记录实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_comment_likes_record")
public class ICommentLikesRecord {
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
     * 评论的id
     */
    private long pId;

    /**
     * 点赞人
     */
    private String likerId;

    /**
     * 点赞时间
     */
    private String likeDate;
}
