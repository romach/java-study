package com.romach.topic2.task1;

import java.util.List;

public class Weather {
    private List<WeatherFactor> weatherFactors;

    public void apply() {
        // logic not realized
    }

    abstract class WeatherFactor {
        private double value;
    }

    class Temperature extends WeatherFactor {

    }

    class Humidity extends WeatherFactor {

    }

    class Pressure extends WeatherFactor {

    }
}


