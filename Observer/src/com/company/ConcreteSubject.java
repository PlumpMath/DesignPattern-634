package com.company;

/**
 * Created by nightwingky on 16-9-13.
 * 具体的目标对象，负责把有关的状态存入到对应的观察者对象中
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
