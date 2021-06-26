package com.example.openplatform.service;

import com.example.openplatform.entity.AdminUser;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 17:32 created.
 */
public interface AdminUserService {
    PageInfo<AdminUser> find(Integer page, Integer limit, String realName, String email, Integer status);
}
