package com.example.openplatform.service;

import com.example.openplatform.entity.Customer;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 10:11 created.
 */
public interface CustomerService {
    PageInfo<Customer> findCustomer(Integer page, Integer limit, String name, Integer state);

    boolean saveCustomer(Customer customer);

    boolean updateCustomer(Customer customer);

    boolean delCustomer(Integer[] id);

    List<Customer> findAll();
}
