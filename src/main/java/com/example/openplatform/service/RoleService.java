package com.example.openplatform.service;

import com.example.openplatform.entity.Role;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 17:15 created.
 */
public interface RoleService {
    PageInfo<Role> find(Integer page, Integer limit, String name);
}
