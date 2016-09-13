package com.company;

/**
 * Created by nightwingky on 16-9-13.
 */
public class ConcreteObserver implements Observer {

    private String observerName;

    private String weatherContent;

    private String remindThing;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent = ((ConcreteWeatherSubject)weatherSubject).getWeatherContent();
        System.out.println(observerName + "收到了" + weatherContent + remindThing);
    }

    @Override
    public String getObserverName() {
        return this.observerName;
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
