package com.company;

/**
 * Created by nightwingky on 16-9-14.
 * 饿汉模式
 */
public class Singleton {

    //构造方法私有化
    private Singleton() {

    }

    //创建类的唯一实例
    private static Singleton instance = new Singleton();

    //提供用于获取实例的方法
    public static Singleton getInstance() {
        return instance;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public void print() {
        System.out.println("Singleton");
    }
}
