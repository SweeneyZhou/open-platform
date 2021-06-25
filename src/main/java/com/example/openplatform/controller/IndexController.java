package com.example.openplatform.controller;

import com.example.openplatform.entity.AdminUser;
import com.example.openplatform.entity.Menu;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.MenuService;
import lombok.AllArgsConstructor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @author sweeney
 * @since 2021/06/23 19:23 created.
 */
@RestController
@RequestMapping("/platform")
@AllArgsConstructor
public class IndexController {

    private final MenuService menuService;

    @GetMapping("/menus")
    public ResultData getMenus(HttpSession session) {
        AdminUser user = (AdminUser) session.getAttribute("user");
        List<Menu> menus = menuService.getByAdminUserId(user.getId());
        return ResultData.builder()
                .result(menus)
                .status(true)
                .build();
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
