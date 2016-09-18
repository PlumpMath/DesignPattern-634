package com.company;

/**
 * Created by nightwingky on 16-9-18.
 */
public class Car3 implements Moveable {

    private Car car;

    public Car3(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() throws InterruptedException {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        car.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...");
        System.out.println("汽车行驶时间:" + (endtime - starttime));
    }
}
