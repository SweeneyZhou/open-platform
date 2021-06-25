package com.example.openplatform.mapper;

import com.example.openplatform.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 10:08 created.
 */
public interface CustomerMapper {
    List<Customer> findCustomer(@Param("username") String username, @Param("state") Integer state);

    int saveCustomer(@Param("customer") Customer customer);

    int delCustomer(Integer[] ids);

    int updateCustomer(@Param("customer") Customer customer);
}
