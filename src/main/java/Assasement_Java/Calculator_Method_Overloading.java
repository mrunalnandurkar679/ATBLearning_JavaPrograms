package Assasement_Java;

public class Calculator_Method_Overloading {
    public static void main(String[] args) {

        add(10,20);
        add(10.5, 15.5);
        add(13,98,90);


    }

     static void add(int a, int b) {
        int add = a + b;
        System.out.println("addition of two numbers: " + add);
    }

    static int add(int a, int b, int c) {
        int add = a + b + c;
        System.out.println("addition of the num: "+add);
        return add;

    }

    static double add(double a, double b) {
        double add = a + b;
        System.out.println("addition is here: " + add);
        return add;
    }

}
