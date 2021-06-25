package com.example.openplatform.controller;

import com.example.openplatform.entity.Customer;
import com.example.openplatform.pojo.ResultData;
import com.example.openplatform.service.CustomerService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author sweeney
 * @since 2021/06/25 10:18 created.
 */

@RestController
@RequestMapping("/sys/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/table")
    public ResultData listCustomer(Integer page, Integer limit, String name, Integer state) {

        PageInfo<Customer> info = customerService.findCustomer(page, limit, name, state);

        return ResultData.builder()
                .code(0)
                .count(info.getTotal())
                .data(info.getList())
                .msg("success")
                .build();

    }

    @PostMapping("/add")
    public ResultData addCustomer(Customer customer) {
        if (customerService.saveCustomer(customer))
            return ResultData.builder()
                    .status(true).message("添加成功").build();
        else
            return ResultData.builder()
                    .status(false).message("添加失败").build();
    }

    @PostMapping("/update")
    public ResultData updateCustomer(Customer customer) {
        System.out.println();
        if (customerService.updateCustomer(customer))
            return ResultData.builder()
                    .status(true).message("修改成功").build();
        else
            return ResultData.builder()
                    .status(false).message("修改失败").build();
    }

    @PostMapping("/del")
    public ResultData delCustomer(@RequestParam Integer[] ids) {
        if (customerService.delCustomer(ids))
            return ResultData.builder()
                    .status(true).message("删除成功").build();
        else
            return ResultData.builder()
                    .status(false).message("删除失败").build();
    }
}

