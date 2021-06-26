package com.example.openplatform.mapper;

import com.example.openplatform.entity.Recharge;
import com.example.openplatform.entity.UserToken;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 17:14 created.
 */
public interface UserTokenMapper {
    List<UserToken> find(String accessToken);
}
