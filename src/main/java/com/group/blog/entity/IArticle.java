package com.group.blog.entity;

import com.group.blog.dto.AutoModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: wenbo
 * @Date: 2018.12.20
 * Describe: 文章实体类
 */
@Entity
@Getter
@Setter
@Table(name = "i_article")
public class IArticle extends AutoModel {
    /**
     * 文章作者
     */
    private String author;
    /**
     * 文章原作者
     */
    private String originalAuthor;
    /**
     * 文章名
     */
    private String articleTitle;
    /**
     * 发布时间
     */
    private String publishDate;
    /**
     * 最后一次修改时间
     */
    private String updateDate;
    /**
     * 文章内容
     */
    private String articleContent;
    /**
     * 文章标签
     */
    private String articleTags;
    /**
     * 文章类型
     */
    private String articleType;
    /**
     * 博客分类
     */
    private String articleCategories;
    /**
     * 原文链接
     * 转载：则是转载的链接
     * 原创：则是在本博客中的链接
     */
    private String articleUrl;
    /**
     * 文章摘要
     */
    private String articleTabloid;
    /**
     * 上一篇文章id
     */
    private String lastArticleId;
    /**
     * 下一篇文章id
     */
    private String nextArticleId;
    /**
     * 喜欢
     */
    private int likes = 0;

}
