package com.example.openplatform.mapper;

import com.example.openplatform.entity.Menu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/24 14:12 created.
 */
public interface MenuMapper {
    List<Menu> getByAdminUserId(Integer id);

    @Select("select id,name,parent_id,url,icon,perms,type,sort from menu where parent_id=#{id}")
    List<Menu> getByParentId(Integer id);
}
