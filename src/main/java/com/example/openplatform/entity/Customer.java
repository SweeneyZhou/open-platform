package com.example.openplatform.entity;

import lombok.Data;

/**
 * @author sweeney
 * @since 2021/06/25 10:07 created.
 */
@Data
public class Customer {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private Long money;

    private String address;

    private Integer state;

}
