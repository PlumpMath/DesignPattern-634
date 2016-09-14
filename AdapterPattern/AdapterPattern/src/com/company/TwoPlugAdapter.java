package com.company;

/**
 * Created by nightwingky on 16-9-14.
 */
public class TwoPlugAdapter implements ThreePlugIntf {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug) {
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        plug.powerWithTwo();
    }
}
