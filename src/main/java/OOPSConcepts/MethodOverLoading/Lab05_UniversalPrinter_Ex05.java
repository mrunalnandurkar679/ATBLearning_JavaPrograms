package OOPSConcepts.MethodOverLoading;

import java.util.Scanner;

public class Lab05_UniversalPrinter_Ex05 {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    int age = scan.nextInt();
    float dob = scan.nextFloat();
    public static void main(String[] args) {
        Printer pt = new Printer();
        pt.printData(pt.name);
        pt.printData(pt.age);
        pt.printData(pt.dob);

    }
}

class Printer extends Lab05_UniversalPrinter_Ex05 {
    String printData(String name) {

        super.name = name;
        System.out.println("my name is : " + name);
        return name;
    }

    int printData(int age) {
        super.age = age;
        System.out.println("my age is : "+age);
        return age;

    }
    float printData(float dob)
    {
        super.dob = dob;
        System.out.println("my dob is :" +dob);
        return dob;
    }
}

