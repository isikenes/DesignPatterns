package com.isikenes.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box extends BoxComponent {
    String name;
    List<BoxComponent> components;

    public Box(String name) {
        this.name = name;
        components=new ArrayList<>();
    }

    @Override
    public void add(BoxComponent boxComponent) {
        components.add(boxComponent);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);

        Iterator iterator= components.iterator();
        System.out.println("\n"+name+" has "+components.size()+" components:");
        while (iterator.hasNext()) {
            BoxComponent component= (BoxComponent) iterator.next();
            component.print();
        }
        System.out.println("\n"+name+" cost: $"+getPrice());
    }

    @Override
    int getPrice() {
        int sum=0;
        Iterator iterator= components.iterator();

        while (iterator.hasNext()) {
            BoxComponent component= (BoxComponent) iterator.next();
            sum+=component.getPrice();
        }
        return sum;
    }
}
