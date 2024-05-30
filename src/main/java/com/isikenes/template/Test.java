package com.isikenes.template;

public class Test {
    public static void main(String[] args) {
        TeaMaker teaMaker=new TeaMaker();
        teaMaker.prepareBeverage();

        System.out.println("\n************************\n");

        CoffeeMaker coffeeMaker=new CoffeeMaker();
        coffeeMaker.prepareBeverage();
    }
}
