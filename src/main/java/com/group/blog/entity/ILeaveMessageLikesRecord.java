package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 留言点赞数实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_leave_message_likes_record")
public class ILeaveMessageLikesRecord {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private long id;

    /**
     * 文章页
     */
    private String pageName;

    /**
     * 评论的id
     */
    private int pId;

    /**
     * 点赞人
     */
    private String likerId;

    /**
     * 点赞时间
     */
    private String likeDate;
}
