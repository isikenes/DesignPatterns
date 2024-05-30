package com.isikenes.composite;

public class Product extends BoxComponent {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(name + " costs $" + price);
    }
}
