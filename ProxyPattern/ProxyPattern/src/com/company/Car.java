package com.company;

import java.util.Random;

/**
 * Created by nightwingky on 16-9-18.
 */
public class Car implements Moveable {

    @Override
    public void move() throws InterruptedException {

        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");

        Thread.sleep(new Random().nextInt(1000));
        System.out.println("汽车行驶中...");

        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...");
        System.out.println("汽车行驶时间:" + (endtime - starttime));
    }
}
