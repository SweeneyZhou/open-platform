package com.example.openplatform.service;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.entity.Menu;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/24 14:13 created.
 */
public interface MenuService {
    List<Menu> getByAdminUserId(Integer id);

    PageInfo<Menu> find(Integer page, Integer limit);
}
