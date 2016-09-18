package com.company;

/**
 * Created by nightwingky on 16-9-18.
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
