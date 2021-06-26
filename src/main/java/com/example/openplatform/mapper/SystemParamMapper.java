package com.example.openplatform.mapper;

import com.example.openplatform.entity.Recharge;
import com.example.openplatform.entity.SystemParam;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 17:13 created.
 */
public interface SystemParamMapper {
    List<SystemParam> find(String name, Integer state);
}
