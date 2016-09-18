package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        Car car = new Car();
        InvocationHandler invocationHandlerTime = new TimeHandler(car);
        Class<?> clsTime = car.getClass();

        /*
            loader 类加载器
            interfaces 实现接口
            h InvocationHandler
         */
        Movable movableTime = (Movable) Proxy.newProxyInstance(
                clsTime.getClassLoader(),
                clsTime.getInterfaces(),
                invocationHandlerTime
        );
        movableTime.move();

        System.out.println();

        InvocationHandler invocationHandlerLog = new LogHandler(car);
        Class<?> clsLog = car.getClass();

        Movable movableLog = (Movable) Proxy.newProxyInstance(
                clsLog.getClassLoader(),
                clsLog.getInterfaces(),
                invocationHandlerLog
        );
        movableLog.move();

    }
}
