package com.example.openplatform.service;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.entity.Recharge;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 17:15 created.
 */
public interface RechargeService {
    PageInfo<Recharge> find(Integer page, Integer limit);
}
