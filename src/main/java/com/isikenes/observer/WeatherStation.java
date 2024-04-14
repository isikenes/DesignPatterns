package com.isikenes.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(20,70, 29);
        weatherData.setMeasurements(30,60, 27);
        weatherData.setMeasurements(10,30, 30);
    }
}
