package com.company;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by nightwingky on 16-9-13.
 */
public class ConcreteObserver implements Observer {

    //观察者名称变量
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {

        //push
        System.out.println(observerName + "收到了消息，目标推送过来的是：" + arg);

        //pull
        System.out.println(observerName + "收到了消息，主动到目标对象中拉取：" +
                ((ConcreteWeatherSubject)o).getContent());
    }

}
