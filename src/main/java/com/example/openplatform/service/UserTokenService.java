package com.example.openplatform.service;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.entity.UserToken;
import com.github.pagehelper.PageInfo;

/**
 * @author sweeney
 * @since 2021/06/25 17:16 created.
 */
public interface UserTokenService {
    PageInfo<UserToken> find(Integer page, Integer limit, String accessToken);
}
