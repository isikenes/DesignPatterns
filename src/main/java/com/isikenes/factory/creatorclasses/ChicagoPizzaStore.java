package com.isikenes.factory.creatorclasses;

import com.isikenes.factory.productclasses.ChicagoStyleCheesePizza;
import com.isikenes.factory.productclasses.ChicagoStylePepperoniPizza;
import com.isikenes.factory.productclasses.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza makeCheesePizza() {
        return new ChicagoStyleCheesePizza();
    }

    @Override
    public Pizza makePepperoniPizza() {
        return new ChicagoStylePepperoniPizza();
    }
}
