package com.driver;

public class Boat {
    private String name;
    private int capacity;

    public void setVehicleName(String Name){
        this.name = Name;
    }
    public String getVehicleName(){
        return this.name;
    }

    public void setCapacity(int currentCapacity){
        this.capacity = currentCapacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
}
