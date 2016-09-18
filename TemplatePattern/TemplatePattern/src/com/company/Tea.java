package com.company;

/**
 * Created by nightwingky on 16-9-18.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用热水浸泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    //子类选择挂载钩子函数
    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }
}
