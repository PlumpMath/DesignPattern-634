package com.company;

/**
 * Created by nightwingky on 16-9-18.
 */
public class CarTimeProxy implements Movable {

    private Movable movable;

    public CarTimeProxy(Movable movable) {
        super();
        this.movable = movable;
    }

    @Override
    public void move() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...");
        System.out.println("汽车行驶时间:" + (endTime - startTime));
    }
}
