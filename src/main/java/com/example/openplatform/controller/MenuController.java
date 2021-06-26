package com.example.openplatform.controller;

import com.example.openplatform.entity.Menu;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.MenuService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sweeney
 * @since 2021/06/25 17:47 created.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/sys/menu")
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/list")
    public ResultData table(Integer page, Integer limit) {
        PageInfo<Menu> info = menuService.find(page, limit);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }
}
