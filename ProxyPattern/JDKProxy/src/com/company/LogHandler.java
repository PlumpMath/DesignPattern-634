package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by nightwingky on 16-9-18.
 */
public class LogHandler implements InvocationHandler {

    private Object target;

    public LogHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("日志开始");

        method.invoke(target, args);

        System.out.println("日志结束");

        return null;
    }
}
