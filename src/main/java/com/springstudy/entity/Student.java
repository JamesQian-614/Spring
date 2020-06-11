package com.springstudy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Student {

    private long id;
    private String name;
    private int age;
    private Address address;

}
