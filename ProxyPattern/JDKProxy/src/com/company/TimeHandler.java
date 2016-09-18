package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by nightwingky on 16-9-18.
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    /*
        proxy 被代理对象
        method 被代理对象的方法
        args 方法的参数

        Object 方法的返回值
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶");

        method.invoke(target, args);

        long endTime = System.currentTimeMillis();
        System.out.println("结束行驶");
        System.out.println("行驶时间：" + (endTime - startTime));

        return null;
    }
}
