package com.xing.zhy_rentcar.pojo;
/*
 * @Author Xing
 * @Date 2022/7/5 15:47
 * @Package com.xing.zhy_rentcar.pojo
 * @Description
 */

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer id;
    private String cusName;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String address;
    private String phone;
    private Double yajin;   // 押金 0.0
    private Date createTime;   // 会员创建日期 今天
    private String password;
    private String pic;         // 会员图片

    public Customer() {
    }

    public Customer(Integer id, String cusName, String sex, Date birthday, String address, String phone, Double yajin, Date createTime, String password, String pic) {
        this.id = id;
        this.cusName = cusName;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.yajin = yajin;
        this.createTime = createTime;
        this.password = password;
        this.pic = pic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getYajin() {
        return yajin;
    }

    public void setYajin(Double yajin) {
        this.yajin = yajin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cusName='" + cusName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", yajin=" + yajin +
                ", createTime=" + createTime +
                ", password='" + password + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}

