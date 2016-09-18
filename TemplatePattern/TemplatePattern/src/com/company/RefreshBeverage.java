package com.company;

/**
 * Created by nightwingky on 16-9-18.
 */
public abstract class RefreshBeverage {
    /*
     * 模板方法
     * 封装所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate() {
        boilWater();

        brew();

        pourInCup();

        if(isCustomerWantsCondiments()) {
            addCondiments();
        }
    }

    //钩子函数，提供默认或空的实现，子类可自行决定是否挂钩或者如何挂钩
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("倒入杯中");
    }

    protected abstract void addCondiments();
}
