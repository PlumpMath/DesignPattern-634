package com.company;

/**
 * Created by nightwingky on 16-9-13.
 * 具体的目标对象，负责把有关的状态存入到对应的观察者对象中
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
