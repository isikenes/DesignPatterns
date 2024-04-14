package com.isikenes.factory;

import com.isikenes.factory.creatorclasses.ChicagoPizzaStore;
import com.isikenes.factory.creatorclasses.NYPizzaStore;
import com.isikenes.factory.creatorclasses.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore dominos = new NYPizzaStore();
        dominos.orderCheesePizza();

        PizzaStore pizzahut = new ChicagoPizzaStore();
        pizzahut.orderPepperoniPizza();
        pizzahut.orderCheesePizza();
    }
}
