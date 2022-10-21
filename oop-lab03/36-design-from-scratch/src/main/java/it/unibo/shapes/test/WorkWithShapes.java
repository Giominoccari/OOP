package it.unibo.shapes.test;

import it.unibo.shapes.api.*;

public class WorkWithShapes {

    public static void main(final String[] args){
        Circle circle = new Circle(5.1);
        Square square = new Square(4.3);
        Rectangle rectangle = new Rectangle(2.1, 3.3);
        Triangle trinagle = new Triangle(4.4);

        System.out.println("Circle:\nArea = "+circle.GetArea()+"\nPerimetro = "+circle.GetPerimeter());
        circle.BiggerShape(3.1);
        System.out.println("Circle:\nArea = "+circle.GetArea()+"\nPerimetro = "+circle.GetPerimeter());
        System.out.println("Square:\nArea = "+square.GetArea()+"\nPerimetro = "+square.GetPerimeter()+"\nNumero lati = "+square.GetEdgeCount());
        square.BiggerShape(5);
        System.out.println("Square:\nArea = "+square.GetArea()+"\nPerimetro = "+square.GetPerimeter()+"\nNumero lati = "+square.GetEdgeCount());
        System.out.println("Rectangle:\nArea = "+rectangle.GetArea()+"\nPerimeter = "+rectangle.GetPerimeter()+"\nNumero lati = "+rectangle.GetEdgeCount());
        System.out.println("Triangle:\nArea = "+trinagle.GetArea()+"\nPerimetro = "+trinagle.GetPerimeter()+"\nNumero lati = "+trinagle.GetEdgeCount());
        trinagle.BiggerShape(4);
        System.out.println("Triangle:\nArea = "+trinagle.GetArea()+"\nPerimetro = "+trinagle.GetPerimeter()+"\nNumero lati = "+trinagle.GetEdgeCount());
    }
}
