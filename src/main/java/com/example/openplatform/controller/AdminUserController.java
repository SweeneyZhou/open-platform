package com.example.openplatform.controller;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.AdminUserService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sweeney
 * @since 2021/06/25 17:31 created.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/sys/user")
public class AdminUserController {
    private final AdminUserService adminUserService;

    @GetMapping("/table")
    public ResultData table(Integer page, Integer limit, String realName, String email, Integer status) {
        PageInfo<AdminUser> info = adminUserService.find(page, limit, realName, email, status);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }
}
