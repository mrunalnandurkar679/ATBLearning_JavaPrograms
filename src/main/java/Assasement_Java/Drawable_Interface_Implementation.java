package Assasement_Java;

public class Drawable_Interface_Implementation {
    public static void main(String[] args) {
       Drawable rect = new Rectangles();
        rect.draw();
        Drawable circle = new Circles();
        circle.draw();


    }
}

interface Drawable
{
    void draw();

}

class Circles implements Drawable
{

    @Override
    public void draw() {
        System.out.println("Drwaing a circle");

    }
}

class Rectangles implements Drawable
{

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");

    }
}