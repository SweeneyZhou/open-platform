package com.example.openplatform.service.impl;

import com.example.openplatform.entity.Menu;
import com.example.openplatform.mapper.MenuMapper;
import com.example.openplatform.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/24 14:20 created.
 */
@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuMapper menuMapper;

    @Override
    public List<Menu> getByAdminUserId(Integer id) {
        List<Menu> menus = menuMapper.getByAdminUserId(id);
        for (Menu menu : menus) {
            menu.setChildren(menuMapper.getByParentId(menu.getId()));
        }
        return menus;
    }
}
