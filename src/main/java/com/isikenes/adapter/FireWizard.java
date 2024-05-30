package com.isikenes.adapter;

public class FireWizard implements Wizard{
    @Override
    public void castSpell() {
        System.out.println("Fire!");
    }

    @Override
    public void shield() {
        System.out.println("Shield!");
    }

    @Override
    public void portal() {
        System.out.println("Portal!");
    }
}
