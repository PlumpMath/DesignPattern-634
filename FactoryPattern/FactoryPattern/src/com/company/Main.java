package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HairFactory factory = new HairFactory();
//        HairInterface left = factory.getHair("left");
//        left.draw();
        HairInterface left = factory.getHairByClass("com.company.LeftHair");
        left.draw();
    }
}
