package com.example.openplatform.config;

import com.example.openplatform.mapper.AdminUserMapper;
import com.example.openplatform.shiro.MyRealm;
import lombok.AllArgsConstructor;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sweeney
 * @since 2021/06/24 9:11 created.
 */
@Configuration
@AllArgsConstructor
public class ShiroConfig {

    private final AdminUserMapper adminUserMapper;

    @Bean
    public Realm realm(){
        return new MyRealm(adminUserMapper);
    }

    // 配置url过滤器
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

        chainDefinition.addPathDefinition("/layui/**", "anon");
        chainDefinition.addPathDefinition("/easyui/**", "anon");
        chainDefinition.addPathDefinition("/platform/login","anon");
        chainDefinition.addPathDefinition("/login.html", "anon");
        chainDefinition.addPathDefinition("/platform/logout", "logout");
        chainDefinition.addPathDefinition("/**", "authc");
        return chainDefinition;
    }
    //启用缓存
    @Bean
    protected CacheManager cacheManager() {
        return new MemoryConstrainedCacheManager();
    }
}
