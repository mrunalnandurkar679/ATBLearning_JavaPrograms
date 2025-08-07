package Assasement_Java;

public class Vehicle_Inheritance_Hierarchy {
    public static void main(String[] args) {
       Vehicle car = new Car();
       Vehicle bike = new Bike();
       car.start(); bike.start();


    }
}

class Vehicle
{
    void start()
    {
        System.out.println("Vehicle engine helps to start");
    }
}

class Car extends  Vehicle
{

    void start()
    {
        System.out.println("Car engine starts with a roar!");
    }
}


class Bike extends Vehicle
{

    void start()
    {
        System.out.println("Bike engine starts with a purr!");
    }

}


