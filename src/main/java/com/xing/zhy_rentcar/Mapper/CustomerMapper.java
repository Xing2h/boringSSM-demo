package com.xing.zhy_rentcar.Mapper;
/*
 * @Author Xing
 * @Date 2022/7/5 16:01
 * @Package com.xing.zhy_rentcar
 * @Description
 */

import com.xing.zhy_rentcar.pojo.Customer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerMapper {
    //显示所有会员
    @Select("SELECT id,cusName,sex,birthday,address,phone,yajin,createTime,password,pic FROM customer")
    public List<Customer> selectCustomer();

    //查询所有会员的数量
    @Select("SELECT COUNT(*) FROM customer;")
    public long getCustomerRowCount();

    //根据会员id查找会员
    @Select("SELECT id,cusName,sex,birthday,address,phone,yajin,createTime,password,pic FROM customer WHERE id = #{id}")
    public Customer selectCustomerById(int id);
}
