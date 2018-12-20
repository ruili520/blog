package com.group.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 文章归档实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_archive")
public class IArchive {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;
    /**
     * 归档日期
     */
    private String archiveName;
}
