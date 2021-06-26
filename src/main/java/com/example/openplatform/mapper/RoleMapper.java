package com.example.openplatform.mapper;

import com.example.openplatform.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 17:12 created.
 */
public interface RoleMapper {
    List<Role> find(String name);
}
