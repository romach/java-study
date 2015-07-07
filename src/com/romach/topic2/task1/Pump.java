package com.romach.topic2.task1;

public class Pump {
    private double power;
    private PumpInput input;
    private PumpOutput output;

    public synchronized void push() {
        this.input.setValue(this.input.getValue-=this.power);
        this.output.setValue(this.output.qetValue+=this.power);
    }
}
