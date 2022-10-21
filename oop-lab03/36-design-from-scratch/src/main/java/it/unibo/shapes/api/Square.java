package it.unibo.shapes.api;

public class Square implements Polygon{

    private double lato;

    public Square(double lung){
        this.lato = lung;
    }
    
    public double GetLato(){
        return this.lato;
    }
    public double GetPerimeter(){
        return 4*this.GetLato();
    }

    public double GetArea(){
        return this.GetLato()*this.GetLato();
    }

    public void BiggerShape(double newlung){
        this.lato = newlung;
    }

    public int GetEdgeCount(){
        return 4;
    }

}
