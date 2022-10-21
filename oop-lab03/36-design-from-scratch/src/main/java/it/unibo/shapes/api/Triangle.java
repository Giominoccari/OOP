package it.unibo.shapes.api;

public class Triangle implements Polygon {
    
    private double lato;

    public Triangle(double lato){
        this.lato = lato;
    }

    public double GetLato(){
        return this.lato;
    }

    public double GetArea(){
        return (this.GetLato()*(this.GetLato()/2))/2;
    }

    public double GetPerimeter(){
        return this.GetLato()*3;
    }

    public void BiggerShape(double newlung){
        this.lato = newlung;
    }

    public int GetEdgeCount(){
        return 3;
    }
}
