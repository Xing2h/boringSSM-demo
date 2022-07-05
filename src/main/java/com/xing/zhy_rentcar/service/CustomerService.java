package com.xing.zhy_rentcar.service;
/*
 * @Author Xing
 * @Date 2022/7/5 16:03
 * @Package com.xing.zhy_rentcar.service
 * @Description
 */

import com.xing.zhy_rentcar.pojo.Customer;

import java.util.List;

public interface CustomerService {
    //获得所有会员
    public List<Customer> queryAllCustomer();

}
