package com.company;

//Template Method Pattern

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("制备咖啡");

        RefreshBeverage refreshBeverageCoffee = new Coffee();
        refreshBeverageCoffee.prepareBeverageTemplate();

        System.out.println("制备成功");

        System.out.println();

        System.out.println("制备茶");

        RefreshBeverage refreshBeverageTea = new Tea();
        refreshBeverageTea.prepareBeverageTemplate();

        System.out.println("制备成功");
    }
}
