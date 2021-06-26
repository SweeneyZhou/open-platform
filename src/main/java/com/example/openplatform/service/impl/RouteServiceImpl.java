package com.example.openplatform.service.impl;

import com.example.openplatform.entity.Route;
import com.example.openplatform.mapper.RouteMapper;
import com.example.openplatform.service.RouteService;
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
public class RouteServiceImpl implements RouteService {
    private final RouteMapper routeMapper;

    @Override
    public PageInfo<Route> find(Integer page, Integer limit, String gatewayApiName, Integer state) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(routeMapper.find(gatewayApiName, state));
    }
}
