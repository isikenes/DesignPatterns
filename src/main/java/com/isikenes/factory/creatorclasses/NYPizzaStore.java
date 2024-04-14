package com.isikenes.factory.creatorclasses;

import com.isikenes.factory.productclasses.NYStyleCheesePizza;
import com.isikenes.factory.productclasses.NYStylePepperoniPizza;
import com.isikenes.factory.productclasses.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza makeCheesePizza() {
        return new NYStyleCheesePizza();
    }

    @Override
    public Pizza makePepperoniPizza() {
        return new NYStylePepperoniPizza();
    }
}
