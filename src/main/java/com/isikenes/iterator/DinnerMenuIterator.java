package com.isikenes.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    String[] items;
    int position=0;

    public DinnerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        String s=items[position];
        position++;
        return s;
    }
}
