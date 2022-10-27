package it.unibo.design.robot.api;

public interface Arm {
    
    boolean isGrabbing();

    void pickUp();

    void dropDown();

    double getConsuptionForPickUp();

    double getConsuptionForDropDown();

}
