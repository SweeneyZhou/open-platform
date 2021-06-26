package com.example.openplatform.controller;

import com.example.openplatform.entity.SystemParam;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.SystemParamService;
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
@RequestMapping("/sys/systemparaters")
public class SystemParamController {
    private final SystemParamService systemParamService;

    @GetMapping("/table")
    public ResultData table(Integer page, Integer limit, String name, Integer state) {
        PageInfo<SystemParam> info = systemParamService.find(page, limit, name, state);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }
}
