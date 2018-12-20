package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 留言实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_leave_message")
public class ILeaveMessage {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * 留言页
     */
    private String pageName;

    /**
     * 留言的父id 若是留言则为 0，则是留言中的回复则为对应留言的id
     */
    private int pId=0;

    /**
     * 留言者
     */
    private String answererId;

    /**
     * 被回复者
     */
    private String respondentId;

    /**
     * 留言日期
     */
    private String leaveMessageDate;

    /**
     * 喜欢数
     */
    private int likes=0;

    /**
     * 留言内容
     */
    private String leaveMessageContent;
}
