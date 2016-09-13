package com.company;

/**
 * Created by nightwingky on 16-9-13.
 * 具体的观察者对象，实现接口的方法，使得自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

    private String observerName;

    private String weatherContent;

    private String remindThing;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

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
        weatherContent = ((ConcreteWeatherSubject) weatherSubject).getWeatherContent();
        System.out.println(observerName + "收到了:" + weatherContent + "，" + remindThing);
    }

}
