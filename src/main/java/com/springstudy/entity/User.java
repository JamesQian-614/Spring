package com.springstudy.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private long id;
    private String name;
    private int age;
    private List<Address> addresses;

    public User() {
        System.out.println("开始创建User对象");
    }
}
