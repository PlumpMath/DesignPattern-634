package com.company;

/**
 * Created by nightwingky on 16-9-13.
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

    @Override
    protected void notifyObservers() {
        for(Observer observer : observers) {
            if(this.getWeatherContent().equals("下雨")) {
                if("Girl".equals(observer.getObserverName()) || "Mom".equals(observer.getObserverName())) {
                    observer.update(this);
                }
            }

            if(this.getWeatherContent().equals("下雪")) {
                if("Mom".equals(observer.getObserverName())) {
                    observer.update(this);
                }
            }
        }
    }
}
