package com.isikenes.decorator;

public class CoffeeShop {
    public static void main(String[] args) {

        Beverage espresso=new Espresso();
        espresso=new Mocha(espresso);
        espresso=new Milk(espresso);
        System.out.println(espresso.getDescription()+" costs "+espresso.cost());

        Beverage houseBlend=new HouseBlend();
        houseBlend=new Milk(houseBlend);
        houseBlend=new Mocha(houseBlend);
        houseBlend=new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription()+" costs "+houseBlend.cost());

    }
}
