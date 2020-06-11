package com.springstudy.test;

import com.springstudy.utils.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        // 获取代理对象
        Cal proxy = (Cal) applicationContext.getBean("test");
        proxy.add(1,1);
        proxy.sub(2,1);
        proxy.mul(2,3);
        proxy.div(4,2);
    }
}
