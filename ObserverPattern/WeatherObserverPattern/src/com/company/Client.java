package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        //1、创建目标
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        //2、创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("Girl");
        observerGirl.setRemindThing("Dating!!!");

        ConcreteObserver observerMom = new ConcreteObserver();
        observerMom.setObserverName("Mom");
        observerMom.setRemindThing("Shopping!!!");

        //3、注册观察者
        weatherSubject.attach(observerGirl);
        weatherSubject.attach(observerMom);

        //4、发布目标天气
        weatherSubject.setWeatherContent("明天天气晴朗，气温28度");
    }
}
