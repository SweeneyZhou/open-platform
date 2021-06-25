package com.example.openplatform.controller;

import com.example.openplatform.entity.AppInfo;
import com.example.openplatform.entity.Customer;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.AppInfoService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author sweeney
 * @since 2021/06/25 11:17 created.
 */
@RestController
@RequestMapping("/sys/app")
@AllArgsConstructor
public class AppInfoController {

    private final AppInfoService appInfoService;

    @GetMapping("/table")
    public ResultData listApp(Integer page, Integer limit, String appName) {
        PageInfo<AppInfo> info = appInfoService.findCustomer(page, limit, appName);
        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();
    }

    @PostMapping("/add")
    public ResultData addCustomer(AppInfo appInfo) {
        if (appInfoService.saveAppInfo(appInfo))
            return ResultData.builder()
                    .status(true).message("添加成功").build();
        else
            return ResultData.builder()
                    .status(false).message("添加失败").build();
    }

    @PostMapping("/update")
    public ResultData updateCustomer(AppInfo appInfo) {
        System.out.println();
        if (appInfoService.updateAppInfo(appInfo))
            return ResultData.builder()
                    .status(true).message("修改成功").build();
        else
            return ResultData.builder()
                    .status(false).message("修改失败").build();
    }

    @PostMapping("/del")
    public ResultData delCustomer(@RequestParam Integer[] ids) {
        if (appInfoService.delAppInfo(ids))
            return ResultData.builder()
                    .status(true).message("删除成功").build();
        else
            return ResultData.builder()
                    .status(false).message("删除失败").build();
    }
}
