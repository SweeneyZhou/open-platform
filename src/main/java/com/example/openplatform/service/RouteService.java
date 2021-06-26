package com.example.openplatform.service;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.entity.Route;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 17:16 created.
 */
public interface RouteService {
    PageInfo<Route> find(Integer page, Integer limit, String gatewayApiName, Integer state);
}
