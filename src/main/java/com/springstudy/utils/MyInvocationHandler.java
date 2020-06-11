package com.springstudy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {

    // 接收委托对象
    private Object object = null;

    // 返回代理对象
    public Object bing(Object o) {
        this.object = o;
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法的参数是" + Arrays.toString(args));
        Object result = method.invoke(this.object, args);
        System.out.println(method.getName() + "的结果是" + result);
        return result;
    }
}
