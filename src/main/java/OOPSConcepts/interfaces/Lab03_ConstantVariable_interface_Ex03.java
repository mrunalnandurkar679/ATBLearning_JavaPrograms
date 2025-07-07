package OOPSConcepts.interfaces;



public class Lab03_ConstantVariable_interface_Ex03 {
    public static void main(String[] args) {
        MotorVehicle c = new MotorVehicle();
        c.maxSpeed();
        SpeedLimit.wheel();


    }
}

interface SpeedLimit
{
     final int Max_Speed = 120;
     static int wheels = 4;

     static void wheel()
     {
         System.out.println("Vehicle has wheels " +wheels);
     }

}

class MotorVehicle implements SpeedLimit
{
    public void maxSpeed()
    {
        System.out.println("Car maxSpeed is :" +Max_Speed);
    }

}