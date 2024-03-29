package com.xing.zhy_rentcar.pojo;

/*
 * @Author Xing
 * @Date 2022/7/5 15:44
 * @Package com.xing.zhy_rentcar.pojo
 * @Description
 */

import java.io.Serializable;

public class Role implements Serializable {
    private int id;
    private String roleName;

    public Role() {
    }

    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
