package com.isikenes.strategy;

import com.isikenes.strategy.flies.CantFly;
import com.isikenes.strategy.quacks.CantQuack;
import com.isikenes.strategy.quacks.Quack;

public class BlackDuck extends Duck{

    public BlackDuck() {
        flyBehaviour=new CantFly();
        quackBehaviour=new Quack();
    }

    @Override
    public void display() {
        System.out.println("black duck");
    }
}
