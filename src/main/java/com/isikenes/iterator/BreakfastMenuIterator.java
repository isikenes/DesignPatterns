package com.isikenes.iterator;

import java.util.Iterator;
import java.util.List;

public class BreakfastMenuIterator implements Iterator {
    List<String> items;
    int position=0;

    public BreakfastMenuIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public Object next() {
        String s=items.get(position);
        position++;
        return s;
    }
}
