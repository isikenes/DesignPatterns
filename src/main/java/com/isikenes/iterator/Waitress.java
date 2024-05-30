package com.isikenes.iterator;

import java.util.Iterator;

public class Waitress {
    Menu breakfastMenu;
    Menu dinnerMenu;

    public Waitress(Menu breakfastMenu, Menu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        System.out.println("Breakfast Menu:");
        print(breakfastMenu.createIterator());

        System.out.println("\nDinner Menu:");
        print(dinnerMenu.createIterator());
    }

    private void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
