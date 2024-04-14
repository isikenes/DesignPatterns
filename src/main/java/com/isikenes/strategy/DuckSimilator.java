package com.isikenes.strategy;

public class DuckSimilator {
    public static void main(String[] args) {
        WhiteDuck whiteDuck=new WhiteDuck();
        whiteDuck.display();
        whiteDuck.performFly();
        whiteDuck.performQuack();

        BlackDuck blackDuck=new BlackDuck();
        blackDuck.display();
        blackDuck.performFly();
        blackDuck.performQuack();
    }
}
