package com.company;

//聚合更加适合代理

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Car car = new Car();
        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
        carLogProxy.move();

        System.out.println();

        CarLogProxy carLogProxy1 = new CarLogProxy(car);
        CarTimeProxy carTimeProxy1 = new CarTimeProxy(carLogProxy1);
        carTimeProxy1.move();

    }
}
