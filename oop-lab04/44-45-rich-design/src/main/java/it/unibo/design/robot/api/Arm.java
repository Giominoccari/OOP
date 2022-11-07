package it.unibo.design.robot.api;

public interface Arm {
    
    boolean isOn();
    
    boolean isGrabbing();

    void pickUp();

    void dropDown();

    double getConsuptionForPickUp();

    double getConsuptionForDropDown();

}
