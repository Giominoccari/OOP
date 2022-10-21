package it.unibo.shapes.api;

public class Rectangle  implements Polygon {

    private double base;
    private double altezza;

    public Rectangle(double b, double a){
        this.base = b;
        this.altezza = a;
    }

    public double GetBase(){
        return this.base;
    }

    public double GetAltezza(){
        return this.altezza;
    }

    public double GetArea(){
        return this.GetBase()*this.GetAltezza();
    }

    public double GetPerimeter(){
        return this.GetAltezza()*2 + this.GetBase()*2;
    }

    public void BiggerShape(double a){

    }

    public int GetEdgeCount(){
        return 4;
    }
}
