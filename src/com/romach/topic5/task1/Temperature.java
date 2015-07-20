package com.romach.topic5.task1;

public class Temperature extends WeatherFactor {
    private double temperatureInCelsius;

    public Temperature() {
    }

    public Temperature(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    @Override
    public double getValue() {
        return this.temperatureInCelsius;
    }

    @Override
    public void setValue(double value) {
        this.temperatureInCelsius = value;
    }

    @Override
    public String toString() {
        return "Temperature: " + this.temperatureInCelsius + "\u00B0 C";
    }
}
