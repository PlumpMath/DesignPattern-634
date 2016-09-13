package com.company;

/**
 * Created by nightwingky on 16-9-13.
 * 具体的观察者对象，实现接口的方法，使得自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }

}
