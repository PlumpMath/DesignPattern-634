package com.company;

/**
 * Created by nightwingky on 16-9-14.
 * 懒汉模式
 */
public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public static void setInstance(Singleton2 instance) {
        Singleton2.instance = instance;
    }

    public void print() {
        System.out.println("Singleton2");
    }
}
