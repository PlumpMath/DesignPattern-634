package com.company;

/**
 * Created by nightwingky on 16-9-14.
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIntf{
    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
