package com.example.openplatform.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author sweeney
 * @since 2021/06/25 15:36 created.
 */
@Data
public class Recharge {
    private Integer id;
    private Integer cusId;
    private Integer orderId;
    private Date createtime;
    private Date updatetime;
    private Long money;
    private Integer state;
    private Integer paymenttype;
}
