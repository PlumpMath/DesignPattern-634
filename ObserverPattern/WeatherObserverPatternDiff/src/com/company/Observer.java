package com.company;

/**
 * Created by nightwingky on 16-9-13.
 */
public interface Observer {

    void update(WeatherSubject weatherSubject);

    String getObserverName();

    void setObserverName(String observerName);
}
