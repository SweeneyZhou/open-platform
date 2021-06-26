package com.example.openplatform.mapper;

import com.example.openplatform.entity.Route;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 17:13 created.
 */
public interface RouteMapper {
    List<Route> find(String gatewayApiName, Integer state);
}
