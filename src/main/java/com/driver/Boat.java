package com.driver;

public class Boat {
    private String name;
    private int capacity;

    public void setName(String name) {
        this.name = name;
    }
    public String getVehicleName(){
        return this.name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getVehicleCapacity(){
        return this.capacity;
    }
}
