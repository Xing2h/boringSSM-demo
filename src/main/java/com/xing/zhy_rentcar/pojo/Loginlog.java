package com.xing.zhy_rentcar.pojo;
/*
 * @Author Xing
 * @Date 2022/7/5 15:48
 * @Package com.xing.zhy_rentcar.pojo
 * @Description
 */

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

public class Loginlog implements Serializable {
    private Integer id;
    private String empId;   /*登录名*/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date loginTime;  /*登录时间*/

    public Loginlog() {
    }

    public Loginlog(Integer id, String empId, Date loginTime) {
        this.id = id;
        this.empId = empId;
        this.loginTime = loginTime;
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

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "Loginlog{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }
}

