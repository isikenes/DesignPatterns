package com.isikenes.template;

public abstract class BeverageMaker {
    final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if(isCondimentWanted())
            addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //hook method
    boolean isCondimentWanted() {
        return true;
    }
}
