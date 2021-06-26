package com.example.openplatform.controller;

import com.example.openplatform.entity.UserToken;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.UserTokenService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sweeney
 * @since 2021/06/25 17:23 created.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/sys/token")
public class UserTokenController {
    private final UserTokenService userTokenService;

    @GetMapping("/table")
    public ResultData table(Integer page, Integer limit, String accessToken) {
        PageInfo<UserToken> info = userTokenService.find(page, limit, accessToken);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }
}
