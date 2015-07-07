package com.romach.topic2.task1;

public class Well {
    private double depth;
    private Water water;
    private List<TheObjct> objects;

    synchronized public TheObject getWater(TheObject object){
        Water water = new Water(object.getCapacity());
        this.subtractWater(water);
        obgect.fill(water);
        return object;
    }

    public void throwObject(TheObject object){
        this.objects.add(object);
    }
}
