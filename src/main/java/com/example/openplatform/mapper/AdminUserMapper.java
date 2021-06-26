package com.example.openplatform.mapper;

import com.example.openplatform.entity.AdminUser;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/24 9:36 created.
 */
public interface AdminUserMapper {
    AdminUser getByEmail(String username);

    List<AdminUser> find(String realName, String email, Integer status);
}
