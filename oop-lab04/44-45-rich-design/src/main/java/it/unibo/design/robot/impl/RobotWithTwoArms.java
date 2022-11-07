package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {


    public int itemsCarried;
    private BaseArm arms[];

    public RobotWithTwoArms(final String RobotName){
        super(RobotName);
        this.itemsCarried = 0;
        this.arms = new BaseArm[2];
        for(int i = 0; i< 2; i++){
            arms[i] = new BaseArm();
        }
    }
    public boolean isArmOn(int index){
        return arms[index].isOn();
    }

    public int getCarriedItemsCount(){
        return this.itemsCarried; 
    }

    public boolean pickUp(){
        if(isBatteryEnough(arms[0].getConsuptionForPickUp())){
            if(itemsCarried < 2){
                for(int i = 0; i < 2; i++){
                    if(!arms[i].isGrabbing()){
                        arms[i].pickUp();
                        itemsCarried++;
                        consumeBattery(arms[i].getConsuptionForPickUp());
                        return true;
                    }
                }
            }
        }
            return false;
    }

    public boolean dropDown(){
        if(isBatteryEnough(arms[0].getConsuptionForDropDown())){
            if(itemsCarried > 0){
                for(int i = 0; i < 2; i++){
                    arms[i].dropDown();
                    itemsCarried--;
                    consumeBattery(arms[i].getConsuptionForDropDown());
                    return true;
                }          
            }
        }
            return false;
    }

}
