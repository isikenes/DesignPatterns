package com.isikenes.facade;

public class CarFacade {
    private Ignition ignition;
    private Engine engine;
    private Tires tires;

    public CarFacade() {
        ignition=new Ignition();
        engine=new Engine();
        tires=new Tires();
    }

    public void driveCar() {
        //PS I know this is not how a car works

        ignition.insertKey();
        engine.start();
        tires.rotate();
    }
}
