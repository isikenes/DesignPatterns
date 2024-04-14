package com.isikenes.observer;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float minTemp=100;
    private float maxTemp;
    private float sumOfTemp;
    private int numOfTemps;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average Temperature: "+(sumOfTemp/numOfTemps)+", Max Temperature: "+maxTemp+", Min Temperature: "+minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        sumOfTemp+=temp;
        numOfTemps++;
        maxTemp= Math.max(temp, maxTemp);
        minTemp=Math.min(temp,minTemp);
        display();
    }
}
