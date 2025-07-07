package OOPSConcepts.interfaces;

public class Lab02_Default_Static_Interface_Ex02 {
    public static void main(String[] args) {
        Vehicle.fuelType();
        Car c = new Car();
        c.start();



    }
}


interface Vehicle{
    default  void start()
    {
        System.out.println("Vehicle Started");
    }
    static void fuelType()
    {
        System.out.println("Fuel type is petrol");
    }

}

class Car implements Vehicle
{
    @Override
    public void start() {
        Vehicle.super.start();
    }
}