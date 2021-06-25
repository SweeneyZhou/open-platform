package com.example.openplatform.service.impl;

import com.example.openplatform.entity.Customer;
import com.example.openplatform.mapper.CustomerMapper;
import com.example.openplatform.service.CustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sweeney
 * @since 2021/06/25 10:13 created.
 */
@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerMapper customerMapper;

    @Override
    public PageInfo<Customer> findCustomer(Integer page, Integer limit, String name, Integer state) {

        PageHelper.startPage(page, limit);

        List<Customer> list = customerMapper.findCustomer(name, state);

        return new PageInfo<>(list);
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        return customerMapper.saveCustomer(customer) > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer) > 0;
    }

    @Override
    public boolean delCustomer(Integer[] ids) {
        return customerMapper.delCustomer(ids) > 0;
    }

}
