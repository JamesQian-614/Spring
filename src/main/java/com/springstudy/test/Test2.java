package com.springstudy.test;

import com.springstudy.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Student student = (Student) applicationContext.getBean("student1");
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student);
        System.out.println(student2);
    }

}
