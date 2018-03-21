package com.gwt.pojo;

import java.util.List;

public class User {
    private Long id;
    private Long DeptId;
    private String name;
    private Integer age;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeptId() {
        return DeptId;
    }

    public void setDeptId(Long deptId) {
        DeptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", DeptId=" + DeptId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
