package com.xing.zhy_rentcar.pojo;
/*
 * @Author Xing
 * @Date 2022/7/5 15:46
 * @Package com.xing.zhy_rentcar.pojo
 * @Description
 */

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer id;
    private String empId;   /*登录名*/
    private String empName; /*姓名*/
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Date joinTime;  /*入职日期*/
    private String idcard;
    private String phone;
    private Integer storeId;
    private String password;
    private Integer roleId;

    public Emp() {
    }

    public Emp(Integer id, String empId, String empName, String sex, Date birthday, Date joinTime, String idcard, String phone, Integer storeId, String password, Integer roleId) {
        this.id = id;
        this.empId = empId;
        this.empName = empName;
        this.sex = sex;
        this.birthday = birthday;
        this.joinTime = joinTime;
        this.idcard = idcard;
        this.phone = phone;
        this.storeId = storeId;
        this.password = password;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", joinTime=" + joinTime +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", storeId=" + storeId +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}

