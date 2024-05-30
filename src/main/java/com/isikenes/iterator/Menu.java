package com.isikenes.iterator;

import java.util.Iterator;

public interface Menu {
    void addItem(String item);
    Iterator createIterator();
}
