package com.xing.zhy_rentcar.pojo;
/*
 * @Author Xing
 * @Date 2022/7/5 15:48
 * @Package com.xing.zhy_rentcar.pojo
 * @Description
 */

import java.io.Serializable;

public class Store implements Serializable {
    private int id;
    private String storeName;
    private String address;
    private String phone;
    private String manager;

    public Store() {
    }

    public Store(int id, String storeName, String address, String phone, String manager) {
        this.id = id;
        this.storeName = storeName;
        this.address = address;
        this.phone = phone;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}

