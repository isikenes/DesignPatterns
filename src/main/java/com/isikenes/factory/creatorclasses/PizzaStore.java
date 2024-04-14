package com.isikenes.factory.creatorclasses;

import com.isikenes.factory.productclasses.Pizza;

public abstract class PizzaStore {

    //I removed String parameter because of if/else statements

    public Pizza orderCheesePizza() {
        Pizza pizza = makeCheesePizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    public Pizza orderPepperoniPizza() {
        Pizza pizza = makePepperoniPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    abstract Pizza makeCheesePizza();

    abstract Pizza makePepperoniPizza();
}
