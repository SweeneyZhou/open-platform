package com.example.openplatform.shiro;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.mapper.AdminUserMapper;
import lombok.AllArgsConstructor;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author sweeney
 * @since 2021/06/24 8:47 created.
 */
@AllArgsConstructor
public class MyRealm extends AuthorizingRealm {

    private final AdminUserMapper adminUserMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 用户登录认证
     * @param token 登录令牌
     * @return 用户信息
     * @throws AuthenticationException 登录失败
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String email = (String) token.getPrincipal();
        AdminUser user = adminUserMapper.getByEmail(email);

        System.out.println("MyRealmUser:"+user);
        if (user == null) {
            throw new UnknownAccountException(); // 账号不存在
        }
        if (user.getStatus() != 1) {
            throw new LockedAccountException();  // 账号被锁定
        }

        return new SimpleAuthenticationInfo(user,
                user.getPassword(),
                getName());
    }
}
