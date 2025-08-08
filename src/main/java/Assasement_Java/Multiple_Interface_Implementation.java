package Assasement_Java;

public class Multiple_Interface_Implementation {
    public static void main(String[] args) {

        Duck d = new Duck();
        d.fly();
        d.swim();

    }
}

interface Flyable
{

    void fly();

}

interface Swimmable
{
    void swim();
}

class Duck implements Flyable,Swimmable
{

    @Override
    public void fly() {
        System.out.println(" Bird can fly");
    }

    @Override
    public void swim() {
        System.out.println("Fish can swim");

    }
}
