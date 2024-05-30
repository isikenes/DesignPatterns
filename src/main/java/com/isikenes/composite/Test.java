package com.isikenes.composite;

public class Test {
    public static void main(String[] args) {
        Box smallBox=new Box("Small Box");
        smallBox.add(new Product("Pencil",1));
        smallBox.add(new Product("Eraser",2));
        smallBox.add(new Product("Notebook",10));

        Box bigBox=new Box("Big Box");
        bigBox.add(new Product("Laptop",1000));
        bigBox.add(new Product("Charger",50));
        bigBox.add(new Product("Headphones",100));
        bigBox.add(smallBox);

        bigBox.print();
    }
}
