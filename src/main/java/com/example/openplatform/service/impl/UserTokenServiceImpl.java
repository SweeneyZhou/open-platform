package com.example.openplatform.service.impl;

import com.example.openplatform.entity.UserToken;
import com.example.openplatform.mapper.UserTokenMapper;
import com.example.openplatform.service.UserTokenService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author sweeney
 * @since 2021/06/25 17:16 created.
 */
@Service
@AllArgsConstructor
public class UserTokenServiceImpl implements UserTokenService {
    private final UserTokenMapper userTokenMapper;

    @Override
    public PageInfo<UserToken> find(Integer page, Integer limit, String accessToken) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(userTokenMapper.find(accessToken));
    }
}
