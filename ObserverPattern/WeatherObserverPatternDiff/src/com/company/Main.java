package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("Girl");
        observerGirl.setRemindThing("Dating!!!");

        ConcreteObserver observerMom = new ConcreteObserver();
        observerMom.setObserverName("Mom");
        observerMom.setRemindThing("Shopping!!!");

        weatherSubject.attach(observerGirl);
        weatherSubject.attach(observerMom);

        weatherSubject.setWeatherContent("晴天");
        weatherSubject.setWeatherContent("下雨");
        weatherSubject.setWeatherContent("下雪");
    }
}
