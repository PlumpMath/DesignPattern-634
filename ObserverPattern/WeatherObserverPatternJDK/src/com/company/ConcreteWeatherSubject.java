package com.company;

import java.util.Observable;

/**
 * Created by nightwingky on 16-9-13.
 */
public class ConcreteWeatherSubject extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        //通知
        //通知之前，调用setChanged()方法
        this.setChanged();

        //主动通知，push方式
        this.notifyObservers(content);

        //主动通知，pull方式
        //this.notifyObservers();
    }
}
