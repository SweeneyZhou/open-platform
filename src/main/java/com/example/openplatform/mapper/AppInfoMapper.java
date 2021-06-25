package com.example.openplatform.mapper;

import com.example.openplatform.entity.AppInfo;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 10:08 created.
 */
public interface AppInfoMapper {
    List<AppInfo> findAppInfo(String corpName);

    int saveAppInfo(AppInfo appInfo);

    int delAppInfo(Integer[] ids);

    int updateAppInfo(AppInfo appInfo);
}
