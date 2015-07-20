package com.romach.topic5.task1;

import java.util.*;

public class WeatherStory {
    private Map<Date,Weather> weathers = new HashMap<>();

    public WeatherStory(){

    }

    public void addWeather(Date date, Weather weather) {
        this.weathers.put(date, weather);
    }

    public List<WeatherFactor> getAllAverageFactorsInRange(DateRange dateRange) {
        List<String> factorNames = Weather.namesOfWeatherFactors;
        List<WeatherFactor> averageFactors = new ArrayList<>();
        for (String factorName : factorNames) {
            averageFactors.add(getAverageFactorFromWeatherList(factorName, getWeathersInRange(dateRange)));
        }
        return averageFactors;
    }

    public WeatherFactor getAverageFactorInRange(String factorName, DateRange dateRange) {
        return getAverageFactorFromWeatherList(factorName, getWeathersInRange(dateRange));
    }

    public List<WeatherFactor> getAllMaximumFactorsInRange(DateRange dateRange) {
        List<String> factorNames = Weather.namesOfWeatherFactors;
        List<WeatherFactor> maximumFactors = new ArrayList<>();
        for (String factorName : factorNames) {
            maximumFactors.add(getExtremumFactorFromWeatherList(factorName, getWeathersInRange(dateRange), new MaximumExtremumStrategy()));
        }
        return maximumFactors;
    }

    public WeatherFactor getMaximumFactorInRange(String factorName, DateRange dateRange) {
        return getExtremumFactorFromWeatherList(factorName, getWeathersInRange(dateRange), new MaximumExtremumStrategy());
    }

    public List<WeatherFactor> getAllMinimumFactorsInRange(DateRange dateRange) {
        List<String> factorNames = Weather.namesOfWeatherFactors;
        List<WeatherFactor> minimumFactors = new ArrayList<>();
        for (String factorName : factorNames) {
            minimumFactors.add(getExtremumFactorFromWeatherList(factorName, getWeathersInRange(dateRange), new MinimumExtremumStrategy()));
        }
        return minimumFactors;
    }

    public WeatherFactor getMinimumFactorInRange(String factorName, DateRange dateRange) {
        return getExtremumFactorFromWeatherList(factorName, getWeathersInRange(dateRange), new MinimumExtremumStrategy());
    }

    private List<Weather> getWeathersInRange(DateRange dateRange) {
        List<Weather> weathersInRange = new ArrayList<>();
        for (Date weatherDate : this.weathers.keySet()) {
            if (weatherDate.compareTo(dateRange.getStartDate()) >= 0
                    && weatherDate.compareTo(dateRange.getEndDate()) <= 0) {
                weathersInRange.add(this.weathers.get(weatherDate));
            }
        }
        return weathersInRange;
    }

    private WeatherFactor getAverageFactorFromWeatherList(String factorName, Collection<Weather> weathers) {
        WeatherFactor averageFactor = null;
        for (Weather weather : weathers) {
            WeatherFactor processingFactor = weather.getFactor(factorName);
            if (averageFactor == null) {
                averageFactor = processingFactor;
                averageFactor.setValue(processingFactor.getValue() / weathers.size());
            } else {
                averageFactor.setValue(averageFactor.getValue() + processingFactor.getValue() / weathers.size());
            }
        }
        return averageFactor;
    }

    private WeatherFactor getExtremumFactorFromWeatherList(String factorName, Collection<Weather> weathers, ExtremumStrategy strategy) {
        WeatherFactor extremumFactor = null;
        for (Weather weather : weathers) {
            WeatherFactor processingFactor = weather.getFactor(factorName);
            if (extremumFactor == null) {
                extremumFactor = processingFactor;
            } else {
                double maximumValue = extremumFactor.getValue();
                double processingValue = processingFactor.getValue();
                extremumFactor.setValue(strategy.getExtremum(maximumValue, processingValue));
            }
        }
        return extremumFactor;
    }

    private interface ExtremumStrategy {
        double getExtremum(double firstValue, double secondValue);
    }

    private class MaximumExtremumStrategy implements ExtremumStrategy {
        @Override
        public double getExtremum(double firstValue, double secondValue) {
            return firstValue > secondValue ? firstValue : secondValue;
        }
    }

    private class MinimumExtremumStrategy implements ExtremumStrategy {
        @Override
        public double getExtremum(double firstValue, double secondValue) {
            return firstValue < secondValue ? firstValue : secondValue;
        }
    }
}
