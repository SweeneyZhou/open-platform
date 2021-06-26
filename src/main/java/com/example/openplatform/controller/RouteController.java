package com.example.openplatform.controller;

import com.example.openplatform.entity.Route;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.RouteService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sweeney
 * @since 2021/06/25 17:18 created.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/sys/route")
public class RouteController {
    private final RouteService routeService;

    @GetMapping("/table")
    public ResultData table(Integer page, Integer limit, String gatewayApiName, Integer state) {
        PageInfo<Route> info = routeService.find(page, limit, gatewayApiName, state);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }
}
