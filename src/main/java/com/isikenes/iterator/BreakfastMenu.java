package com.isikenes.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu{
    List<String> items;

    public BreakfastMenu() {
        items=new ArrayList<>();
    }

    @Override
    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastMenuIterator(items);
    }
}
