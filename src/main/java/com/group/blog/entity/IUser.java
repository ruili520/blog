package com.group.blog.entity;

import com.group.blog.dto.AutoModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: wenbo
 * @Date: 2018.12.14
 * Describe: 用户实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_user")
public class IUser extends AutoModel {
    private String phone;
    private String username;
    private String password;
    private String gender;//性别
    private String trueName;
    private String birthday;
    private String personalBrief;//个人简介
    private String email;
    private String recentlyLanded;//最后登录时间
    private String avatarImgUrl;//头像地址

}
