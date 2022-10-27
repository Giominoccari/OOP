package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.Arm;

public class BaseArm implements Arm {

    public static final double CONSUMPTION_FOR_PICKUP = 1.5;
    public static final double CONSUMPTION_FOR_DROPDOWN = 1.1;

    private boolean isGrabbing;

    public BaseArm(){
        this.isGrabbing = false;
    }

    public boolean isGrabbing(){
        return this.isGrabbing;
    }

    public void pickUp(){
        isGrabbing = true;
    }

    public void dropDown(){
        isGrabbing = false;
    }

    public double getConsuptionForPickUp(){
        return CONSUMPTION_FOR_PICKUP;
    }

    public double getConsuptionForDropDown(){
        return CONSUMPTION_FOR_DROPDOWN;
    }
}
