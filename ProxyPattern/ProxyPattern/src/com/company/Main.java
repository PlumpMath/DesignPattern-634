package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Car car = new Car();
        try {
            car.move();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        Car2 car2 = new Car2();
        try {
            car2.move();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        Car car1 = new Car();
        Moveable moveable = new Car3(car1);
        moveable.move();
    }
}
