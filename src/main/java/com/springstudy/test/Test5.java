package com.springstudy.test;

import com.springstudy.utils.Cal;
import com.springstudy.utils.MyInvocationHandler;
import com.springstudy.utils.impl.CalImpl;

public class Test5 {
    public static void main(String[] args) {
//        Cal cal = new CalImpl();
//        cal.add(1, 2);
//        cal.sub(2, 1);
//        cal.mul(2, 3);
//        cal.div(4, 2);
        Cal cal = new CalImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal call = (Cal) myInvocationHandler.bing(cal);
        call.add(1,1);
        call.sub(2,1);
        call.mul(2,3);
        call.div(4,2);
    }
}
