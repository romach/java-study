package com.romach.topic2.task1;

public class Valve {
    private ValveInput input;
    private ValveOutput output;
    private boolean isOpen;

    public boolean getIsOpen(){
        return this.isOpen;
    }

    public void close(){
        this.isOpen = false;
    }

    public void open(){
        this.isOpen = true;
    }
}
