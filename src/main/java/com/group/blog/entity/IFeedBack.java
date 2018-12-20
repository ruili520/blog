package com.group.blog.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 反馈实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_comment_likes_record")
public class IFeedBack {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * 反馈内容
     */
    private String feedbackContent;

    /**
     * 联系方式
     */
    private String contactInfo;

    /**
     * 反馈人
     */
    private String personId;

    /**
     * 反馈时间
     */
    private String feedbackDate;
}
