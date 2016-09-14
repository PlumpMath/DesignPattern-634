package com.company;

public class Main {

    private ThreePlugIntf plugIntf;

    public Main(ThreePlugIntf plugIntf) {
        this.plugIntf = plugIntf;
    }

    public void charge() {
        plugIntf.powerWithThree();
    }

    public static void main(String[] args) {
	// write your code here
        GBTwoPlug twoPlug = new GBTwoPlug();
        ThreePlugIntf threePlug = new TwoPlugAdapter(twoPlug);
        Main main = new Main(threePlug);
        main.charge();

        threePlug = new TwoPlugAdapterExtends();
        main = new Main(threePlug);
        main.charge();
    }
}
