package com.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by dell on 2020/11/26.
 */
@Data
public class Menu implements Serializable {
    private static final long serialVersionUID = 489914127235951698L;
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;
}
