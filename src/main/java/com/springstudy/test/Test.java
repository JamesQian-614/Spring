package com.springstudy.test;

import com.springstudy.entity.Student;
import com.springstudy.entity.User;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setId(1L);
//        student.setName("张三");
//        student.setAge(11);
//        System.out.println(student);

        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Student student = (Student) applicationContext.getBean("student2");
//        Student stu = (Student) applicationContext.getBean("stu");
//        System.out.println(student);
//        System.out.println(stu);
//        System.out.println(stu.equals(student));
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
