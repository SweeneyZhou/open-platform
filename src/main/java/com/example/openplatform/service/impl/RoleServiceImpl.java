package com.example.openplatform.service.impl;

import com.example.openplatform.entity.Role;
import com.example.openplatform.mapper.RoleMapper;
import com.example.openplatform.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author sweeney
 * @since 2021/06/25 17:15 created.
 */
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleMapper roleMapper;

    @Override
    public PageInfo<Role> find(Integer page, Integer limit, String name) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(roleMapper.find(name));
    }
}
