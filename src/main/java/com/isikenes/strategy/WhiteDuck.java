package com.isikenes.strategy;

import com.isikenes.strategy.flies.FlyWithWings;
import com.isikenes.strategy.quacks.Squeak;

public class WhiteDuck extends Duck{

    public WhiteDuck() {
        flyBehaviour=new FlyWithWings();
        quackBehaviour=new Squeak();
    }

    public void display() {
        System.out.println("white duck");
    }
}
