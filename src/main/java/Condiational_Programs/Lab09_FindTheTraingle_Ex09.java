package Condiational_Programs;

import java.util.Scanner;

public class Lab09_FindTheTraingle_Ex09 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the sides 1 : ");
         int side1 = scan.nextInt();
        System.out.println("enter the sides 2: ");
        int side2 = scan.nextInt();
        System.out.println("enter the sides 3: ");
        int side3 = scan.nextInt();
        trainlge(side1, side2, side3);

    }

    static void trainlge(int side1, int side2, int side3)
    {
        if (side1 == side2 &side1 == side3)
        {
            System.out.println("Traingle is equlateral");
        }
        else  if (side1 == side2 || side1 == side3 || side2 == side3)
        {
            System.out.println("Traingle is isosceles");
        }
        else
        {
            System.out.println("Traingle is scalene");
        }
    }
}
