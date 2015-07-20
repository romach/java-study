package com.romach.topic5.task1;

import java.util.*;

public class Weather {
    private Map<String, WeatherFactor> weatherFactors = new HashMap<>();
    public static final List<String> namesOfWeatherFactors = Collections.unmodifiableList(Arrays.asList("dayLightDuration", "temperature", "humidity"));

    public Weather(){

    }

    public Weather(DayLightDuration dayLightDuration, Temperature temperature, Humidity humidity) {
        this.weatherFactors.put("dayLightDuration", dayLightDuration);
        this.weatherFactors.put("temperature", temperature);
        this.weatherFactors.put("humidity", humidity);

    }

    public WeatherFactor getFactor(String factorName) {
        return this.weatherFactors.get(factorName);
    }
}
