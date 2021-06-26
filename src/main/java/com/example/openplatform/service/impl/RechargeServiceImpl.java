package com.example.openplatform.service.impl;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.entity.Recharge;
import com.example.openplatform.mapper.RechargeMapper;
import com.example.openplatform.service.RechargeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 17:15 created.
 */
@Service
@AllArgsConstructor
public class RechargeServiceImpl implements RechargeService {
    private final RechargeMapper rechargeMapper;

    @Override
    public PageInfo<Recharge> find(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(rechargeMapper.find());
    }
}
