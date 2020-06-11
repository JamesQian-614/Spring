package com.springstudy.test;

import com.springstudy.entity.Car;
import com.springstudy.factory.InstanceCarFactory;
import com.springstudy.factory.StaticCarFactory;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = (Car) applicationContext.getBean("car2");
        System.out.println(car);
//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        Car car = instanceCarFactory.getCar(1L);
//        System.out.println(car);

    }
}
