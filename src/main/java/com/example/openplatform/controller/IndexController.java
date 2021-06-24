package com.example.openplatform.controller;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.pojo.ResultData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


/**
 * @author sweeney
 * @since 2021/06/23 19:23 created.
 */
@RestController
@RequestMapping("/platform")
public class IndexController {

    @GetMapping("/menus")
    public String getMenus(){
        return "spring aop";
    }

    @PostMapping("/login")
    public ResultData login(AdminUser adminUser, HttpSession session){
        Subject subject= SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(adminUser.getEmail(),adminUser.getPassword()));
        System.out.println("用户已登录:"+subject.getPrincipal());
        session.setAttribute("user",subject.getPrincipal());
        return ResultData.builder()
                .status(true)
                .build();
    }
}
