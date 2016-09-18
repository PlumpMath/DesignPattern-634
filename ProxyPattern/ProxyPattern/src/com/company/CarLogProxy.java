package com.company;

/**
 * Created by nightwingky on 16-9-18.
 */
public class CarLogProxy implements Movable {

    private Movable movable;

    public CarLogProxy(Movable movable) {
        super();
        this.movable = movable;
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println("日志开始");
        movable.move();
        System.out.println("日志结束");
    }
}
