package it.unibo.design.robot.api;

public interface RobotWithArms extends Robot{
    boolean isArmOn(int index);

    boolean pickUp();

    boolean dropDown();

    int getCarriedItemsCount();
    
}
