package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 权限实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_role")
public class IRole {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    private String name;
}
