package com.example.openplatform.entity;

import lombok.Data;

/**
 * @author sweeney
 * @since 2021/06/25 15:32 created.
 */
@Data
public class Route {
    private Integer id;
    private String gatewayApiName;
    private String insideApiUrl;
    private Integer state;
    private String description;
    private String serviceId;
    private String idempotents;
    private String needfee;
}
