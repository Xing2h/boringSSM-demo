package com.xing.zhy_rentcar.service;
/*
 * @Author Xing
 * @Date 2022/7/5 16:05
 * @Package com.xing.zhy_rentcar.service
 * @Description
 */

import com.xing.zhy_rentcar.Mapper.CustomerMapper;
import com.xing.zhy_rentcar.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    //业务层调用数据访问层
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> queryAllCustomer() {
        return customerMapper.selectCustomer();
    }
}
