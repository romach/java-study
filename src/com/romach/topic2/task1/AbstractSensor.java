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

    public TemperatureSensor(Temperature parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class HumiditySensor extends AbstractSensor {

    public HumiditySensor(Humidity parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class LightSensor extends AbstractSensor {

    public LightSensor(Light parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class AciditySensor extends AbstractSensor {

    public AciditySensor(Acidity parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}

class FlowSensor extends AbstractSensor {

    public FlowSensor(Flow parameter) {
        super(parameter);
    }

    @Override
    public void measure() {
        // logic not implemented
    }
}