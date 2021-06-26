package com.example.openplatform.service.impl;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.mapper.AdminUserMapper;
import com.example.openplatform.service.AdminUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author sweeney
 * @since 2021/06/25 17:32 created.
 */
@Service
@AllArgsConstructor
public class AdminUserServiceImpl implements AdminUserService {
    private final AdminUserMapper adminUserMapper;

    @Override
    public PageInfo<AdminUser> find(Integer page, Integer limit, String realName, String email, Integer status) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(adminUserMapper.find(realName, email, status));
    }
}
