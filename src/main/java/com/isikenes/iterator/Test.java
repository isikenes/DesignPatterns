package com.isikenes.iterator;

public class Test {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu=new BreakfastMenu();
        breakfastMenu.addItem("Omelet");
        breakfastMenu.addItem("Pancakes");
        breakfastMenu.addItem("Sandwich");
        breakfastMenu.addItem("Toast");

        DinnerMenu dinnerMenu=new DinnerMenu(5);
        dinnerMenu.addItem("Pizza");
        dinnerMenu.addItem("Spaghetti");
        dinnerMenu.addItem("Steak");
        dinnerMenu.addItem("Soup");

        Waitress waitress=new Waitress(breakfastMenu, dinnerMenu);
        waitress.printMenu();
    }
}
