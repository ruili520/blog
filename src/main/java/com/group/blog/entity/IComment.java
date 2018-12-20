package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 文章评论实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_comment")
public class IComment {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private long id;

    /**
     * 留言的文章id
     */
    private String articleId;

    /**
     * 留言的文章的原作者
     */
    private String originalAuthor;

    /**
     * 回复的父id 若是评论则为 0，则是评论中的回复则为对应评论的id
     */
    private long pId=0;

    /**
     * 评论者
     */
    private String answererId;

    /**
     * 被回复者
     */
    private String respondentId;

    /**
     * 评论日期
     */
    private String commentDate;

    /**
     * 喜欢数
     */
    private int likes=0;

    /**
     * 评论内容
     */
    private String commentContent;
}
