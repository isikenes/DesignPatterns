package com.isikenes.adapter;

public class Test {
    public static void main(String[] args) {
        Wizard wizard=new FireWizard();
        Fighter fighterWizard=new WizardAdapter(wizard);

        fighterWizard.attack();
        fighterWizard.defend();
        fighterWizard.escape();

    }
}
