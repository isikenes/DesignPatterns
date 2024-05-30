package com.isikenes.composite;

public abstract class BoxComponent {

    void add(BoxComponent boxComponent) {
        throw new UnsupportedOperationException();
    }

    String getName() {
        throw new UnsupportedOperationException();
    }

    int getPrice() {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }
}
