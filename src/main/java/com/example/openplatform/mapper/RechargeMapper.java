package com.example.openplatform.mapper;

import com.example.openplatform.entity.Recharge;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 17:10 created.
 */
public interface RechargeMapper {
    @Select("select id, cusId, orderId, createtime, updatetime, money, state, paymenttype from recharge")
    List<Recharge> find();
}
