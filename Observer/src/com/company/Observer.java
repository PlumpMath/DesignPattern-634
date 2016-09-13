package com.company;

/**
 * Created by nightwingky on 16-9-13.
 * 观察者接口，定义一个更新的接口给那些在目标发生改变时被通知的对象
 */
public interface Observer {

    void update(Subject subject);

}
