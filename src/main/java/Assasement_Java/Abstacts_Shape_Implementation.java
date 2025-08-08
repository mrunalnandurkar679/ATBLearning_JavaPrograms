package Assasement_Java;

import java.awt.*;

public class Abstacts_Shape_Implementation {

    public static void main(String[] args) {
        Shape r = new Rectangle();
        r.getArea();
        Circle c = new Circle();
        c.getArea();

    }
}

abstract class  Shape {
    public abstract void getArea();
}

 class Rectangle extends Shape
{


    @Override
    public void getArea() {

        double area = 5*3;
        System.out.println("Rectangle area: " +area);
    }
}

class Circle extends Shape
{

    @Override
    public void getArea() {
        double area = 3.14*4*4;
        System.out.println("Circle area: " +area);
    }
}
