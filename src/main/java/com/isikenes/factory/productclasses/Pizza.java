package com.isikenes.factory.productclasses;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name + "\n");
    }

    public String getName() {
        return name;
    }
}
