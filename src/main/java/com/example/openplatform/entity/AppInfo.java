package com.example.openplatform.entity;

import lombok.Data;

/**
 * @author sweeney
 * @since 2021/06/25 12:01 created.
 */
@Data
public class AppInfo {
    private Integer id;
    private String corpName;
    private String appName;
    private String appKey;
    private String appSecret;
    private String redirectUrl;
    private String description;
    private Integer limitCount;
    private Integer cusId;
    private Integer state;
}
