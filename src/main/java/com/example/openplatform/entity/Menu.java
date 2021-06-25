package com.example.openplatform.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/24 14:09 created.
 */
@Data
public class Menu {
    private Integer id;
    private String name;
    private Integer parentId;
    private String url;
    private String icon;
    private String perms;
    private Integer type;
    private Integer sort;
    private List<Menu> children = new ArrayList<>();
}
