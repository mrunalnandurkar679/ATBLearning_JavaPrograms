package OOPSConcepts.MethodOverriding;

public class Lab02_VehicleTart_Ex02 {
    public static void main(String[] args) {

        Bike b = new Bike();
        Car c = new Car();
        Vehicle v = new Vehicle();
        v.start();
        b.start();
        c.start();

    }
}

class Vehicle
{
    void start()
    {
        System.out.println("engine helps to start vehicle :");
    }
}

class Bike extends Vehicle
{
    void start()
    {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle
{
    @Override
    void start() {
        super.start();  // print the parent class method execution
        System.out.println("Turn the key to start the car");
    }
}
