package com.example.openplatform.service.impl;

import com.example.openplatform.entity.AppInfo;
import com.example.openplatform.mapper.AppInfoMapper;
import com.example.openplatform.service.AppInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 13:49 created.
 */
@Service
@AllArgsConstructor
public class AppInfoServiceImpl implements AppInfoService {

    private final AppInfoMapper appInfoMapper;

    @Override
    public PageInfo<AppInfo> findCustomer(Integer page, Integer limit, String corpName) {
        PageHelper.startPage(page, limit);
        List<AppInfo> list = appInfoMapper.findAppInfo(corpName);
        return new PageInfo<>(list);
    }

    @Override
    public boolean saveAppInfo(AppInfo appInfo) {
        return appInfoMapper.saveAppInfo(appInfo) > 0;
    }

    @Override
    public boolean updateAppInfo(AppInfo appInfo) {
        return appInfoMapper.updateAppInfo(appInfo) > 0;
    }

    @Override
    public boolean delAppInfo(Integer[] ids) {
        return appInfoMapper.delAppInfo(ids) > 0;
    }
}
