package com.example.openplatform.service.impl;

import com.example.openplatform.entity.SystemParam;
import com.example.openplatform.mapper.SystemParamMapper;
import com.example.openplatform.service.SystemParamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author sweeney
 * @since 2021/06/25 17:16 created.
 */
@Service
@AllArgsConstructor
public class SystemParamServiceImpl implements SystemParamService {
    private final SystemParamMapper systemParamMapper;

    @Override
    public PageInfo<SystemParam> find(Integer page, Integer limit, String name, Integer state) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(systemParamMapper.find(name, state));
    }
}
