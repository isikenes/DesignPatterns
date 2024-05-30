package com.isikenes.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{
    int size;
    String[] items;
    int numberOfItems=0;

    public DinnerMenu(int size) {
        this.size = size;
        items=new String[size];
    }

    @Override
    public void addItem(String item) {
        if(numberOfItems>=size) {
            System.out.println("Menu is full!");
        } else{
            items[numberOfItems]=item;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(items);
    }
}
