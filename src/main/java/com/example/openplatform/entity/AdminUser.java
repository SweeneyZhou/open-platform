package com.example.openplatform.entity;

import lombok.Data;

/**
 * @author sweeney
 * @since 2021/06/24 9:31 created.
 */
@Data
public class AdminUser {
    private Integer id;
    private String password;
    private String email;
    private String realName;
    private Integer status;
}
