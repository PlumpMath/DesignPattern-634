package com.company;

import java.util.Random;

/**
 * Created by nightwingky on 16-9-18.
 */
public class Car implements Movable {

    @Override
    public void move() throws InterruptedException {

        Thread.sleep(new Random().nextInt(1000));
        System.out.println("汽车行驶中...");

    }
}
