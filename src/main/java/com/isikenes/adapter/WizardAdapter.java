package com.isikenes.adapter;

public class WizardAdapter implements Fighter{
    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        wizard.castSpell();
    }

    @Override
    public void defend() {
        wizard.shield();
    }

    @Override
    public void escape() {
        wizard.portal();
    }
}
