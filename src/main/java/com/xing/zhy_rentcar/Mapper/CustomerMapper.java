package com.xing.zhy_rentcar.Mapper;
/*
 * @Author Xing
 * @Date 2022/7/5 16:01
 * @Package com.xing.zhy_rentcar
 * @Description
 */

import com.xing.zhy_rentcar.pojo.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * MyBatis 接口
 * Customer接口，定义的方法是对customer表的增删改查
 */
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

    /**
     * 添加会员
     *
     * @param customer 要添加的会员
     * @return 返回添加行数
     */
    @Insert("INSERT INTO customer(cusName,sex,birthday,address,phone,yajin,createTime,password,pic) " +
            "VALUES (#{cusName},#{sex},#{birthday},#{address},#{phone},0,now(),#{password},#{pic})")
    public int insertCustomer(Customer customer);

    /**
     * 根据id删除会员
     *
     * @param id 会员id
     * @return
     */
    @Delete("DELETE FROM customer WHERE id = #{id}")
    public int deleteCustomerById(int id);

    /**
     * 修改会员信息
     *
     * @param customer 要修改的会员
     * @return
     */
    @Update("UPDATE customer SET cusName=#{cusName},sex=#{sex},birthday=#{birthday},address=#{address},phone=#{phone}," +
            "yajin=#{yajin},password=#{password},pic=#{pic} WHERE id =#{id} ")
    public int updateCustomer(Customer customer);
}
