package com.romach.topic2.task1;

abstract class MeasuredParameter {};
class Temperature extends MeasuredParameter {};
class Humidity extends MeasuredParameter {};
class Light extends MeasuredParameter {};
class Acidity extends MeasuredParameter {};
class Flow extends MeasuredParameter {};

public abstract class AbstractSensor {
    protected MeasuredParameter parameter;
    protected double value;

    public AbstractSensor(MeasuredParameter parameter) {
        this.parameter = parameter;
    }

    public double getValue() {
        return this.value;
    }

    public abstract void measure();
}

class TemperatureSensor extends AbstractSensor {

    public TemperatureSensor(MeasuredParameter parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class HumiditySensor extends AbstractSensor {

    public HumiditySensor(MeasuredParameter parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class LightSensor extends AbstractSensor {

    public LightSensor(MeasuredParameter parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class AciditySensor extends AbstractSensor {

    public AciditySensor(MeasuredParameter parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class FlowSensor extends AbstractSensor {

    public FlowSensor(MeasuredParameter parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}