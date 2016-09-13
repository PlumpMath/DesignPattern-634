package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("Girl");

        ConcreteObserver observerMom = new ConcreteObserver();
        observerMom.setObserverName("Mom");

        weatherSubject.addObserver(observerGirl);
        weatherSubject.addObserver(observerMom);

        weatherSubject.setContent("天气晴朗，气温28度");
    }
}
