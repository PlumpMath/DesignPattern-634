package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nightwingky on 16-9-13.
 */
public abstract class WeatherSubject {

    public List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected abstract void notifyObservers();
}
