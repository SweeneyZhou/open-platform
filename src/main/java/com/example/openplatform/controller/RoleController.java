package com.example.openplatform.controller;

import com.example.openplatform.entity.Role;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.RoleService;
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
@RequestMapping("/sys/role")
public class RoleController {
    private final RoleService roleService;

    @GetMapping("/table")
    public ResultData table(Integer page, Integer limit, String name) {
        PageInfo<Role> info = roleService.find(page, limit, name);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }
}
