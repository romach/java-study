package com.romach.topic5.task1;

public class Humidity extends WeatherFactor {
    private double humidity;

    public Humidity() {
    }

    public Humidity(double humidity) {
        this.humidity = humidity;
    }


    @Override
    public double getValue() {
        return this.humidity;
    }

    @Override
    public void setValue(double value) {
        this.humidity = value;
    }

    @Override
    public String toString() {
        return "Humidity: " + this.humidity + " %";
    }
}
