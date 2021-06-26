package com.example.openplatform.service;

import com.example.openplatform.entity.SystemParam;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 17:16 created.
 */
public interface SystemParamService {
    PageInfo<SystemParam> find(Integer page, Integer limit, String name, Integer state);
}
