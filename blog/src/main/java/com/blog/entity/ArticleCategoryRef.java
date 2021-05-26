package com.blog.entity;

import java.io.Serializable;

/**
 * Created by dell on 2020/11/26.
 */
public class ArticleCategoryRef implements Serializable{
    private static final long serialVersionUID = -6809206515467725995L;

    private Integer articleId;

    private Integer categoryId;

    public ArticleCategoryRef() {
    }

    public ArticleCategoryRef(Integer articleId, Integer categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }
}
