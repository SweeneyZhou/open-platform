package com.example.openplatform.service;

import com.example.openplatform.entity.AppInfo;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 12:00 created.
 */
public interface AppInfoService {
    PageInfo<AppInfo> findCustomer(Integer page, Integer limit, String corpName);

    boolean saveAppInfo(AppInfo appInfo);

    boolean updateAppInfo(AppInfo appInfo);

    boolean delAppInfo(Integer[] ids);
}
