package com.romach.topic5.task1;

import java.util.Formatter;
import java.util.Locale;

public class DayLightDuration extends WeatherFactor {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    private int durationInSeconds;

    public DayLightDuration() {
    }

    public DayLightDuration(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public double getValue() {
        return this.durationInSeconds;
    }

    @Override
    public void setValue(double value) {
        this.durationInSeconds = (int) value;
    }

    private String formatTime(int timeInSeconds) {
        int seconds = this.durationInSeconds % SECONDS_IN_MINUTE;
        int minutes = (this.durationInSeconds - seconds) % SECONDS_IN_MINUTE;
        int hours = this.durationInSeconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hours);
        stringBuilder.append(" h, ");
        stringBuilder.append(minutes);
        stringBuilder.append(" m, ");
        stringBuilder.append(seconds);
        stringBuilder.append(" s");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Duration of the day light: ");
        stringBuilder.append(this.formatTime(this.durationInSeconds));
        return stringBuilder.toString();
    }


}
