package com.romach.topic5.task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Runner {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("FF.MM.yyyy");
        WeatherStory weatherStory = new WeatherStory();
        weatherStory.addWeather(format.parse("01.01.2000"), new Weather(
                new DayLightDuration(10 * 60 * 60),
                new Temperature(10),
                new Humidity(10)
        ));

        weatherStory.addWeather(format.parse("02.01.2000"), new Weather(
                new DayLightDuration(12 * 60 * 60),
                new Temperature(15),
                new Humidity(15)
        ));

        weatherStory.addWeather(format.parse("03.01.2000"), new Weather(
                new DayLightDuration(14 * 60 * 60),
                new Temperature(20),
                new Humidity(20)
        ));

        DateRange dateRange = new DateRange(format.parse("01.01.2000"), format.parse("03.01.2000"));

        // All average factors
        for (WeatherFactor factor : weatherStory.getAllAverageFactorsInRange(dateRange)) {
            System.out.println(factor);
        }

        System.out.println("****");

        // All maximum factors
        for (WeatherFactor factor : weatherStory.getAllMaximumFactorsInRange(dateRange)) {
            System.out.println(factor);
        }

        System.out.println("****");

        // All minimum factors
        for (WeatherFactor factor : weatherStory.getAllMinimumFactorsInRange(dateRange)) {
            System.out.println(factor);
        }
    }
}
