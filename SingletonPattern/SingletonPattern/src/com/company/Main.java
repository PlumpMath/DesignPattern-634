package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Singleton singleton = Singleton.getInstance();
        singleton.print();

        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.print();
    }
}
