package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, isManual);
    }
//    public String getName(){
//        return getName();
//    }
    public void accelerate(int rate){
        int newSpeed = 0;
        int curSpeed = getCurrentSpeed();
        newSpeed = curSpeed + rate;
        if(newSpeed == 0) {
            stop();
            changeGear(1);
        }
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            if(newSpeed >= 1 && newSpeed <= 50) changeGear(1);
            if(newSpeed >= 51 && newSpeed <= 100) changeGear(2);
            if(newSpeed >= 101 && newSpeed <= 150) changeGear(3);
            if(newSpeed >= 151 && newSpeed <= 200) changeGear(4);
            if(newSpeed >= 201 && newSpeed <= 250) changeGear(5);
            if(newSpeed <= 250) changeGear(6);
        }
    }
}
