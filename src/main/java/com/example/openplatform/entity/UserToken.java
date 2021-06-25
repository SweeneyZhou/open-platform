package com.example.openplatform.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author sweeney
 * @since 2021/06/25 15:40 created.
 */
@Data
public class UserToken {
    private Integer id;
    private Integer appId;
    private String accessToken;
    private Date expireTime;
    private Date startTime;
}
