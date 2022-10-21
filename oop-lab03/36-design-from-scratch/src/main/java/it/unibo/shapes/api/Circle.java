package it.unibo.shapes.api;

import java.lang.Math;

public class Circle implements Shape {
    
    private double r;
    private final float pi = (float)Math.PI; 

    public Circle(double r){
        this.r = r;
    }

    public double GetR(){
        return this.r;
    }

    public double GetArea(){
        return this.pi*this.GetR()*this.GetR();
    }

    public double GetPerimeter(){
        return 2*this.pi*this.GetR();
    }

    public void BiggerShape(double r){
        this.r = r;
    }
}
