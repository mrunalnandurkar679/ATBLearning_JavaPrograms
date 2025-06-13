package Condiational_Programs;

import java.util.Scanner;

// Find out the largest number from the list of 3 num
public class LAB04_LargestNum_Ex04 {

    public static Scanner scan = new Scanner(System.in);
    static int num1 = scan.nextInt();
    static int num2 = scan.nextInt();
    static int num3 = scan.nextInt();

    public static void main(String[] args) {

        largest();
    }

    public static void largest()
    {
        if (num1 > num2 & num1 > num3)
        {
            System.out.println("num1 is the lasrest number");
        }
        if (num2 > num1 & num2 > num3)
        {
            System.out.println("num2 is teh largest number");
        }
        if (num1 == num2 & num1 == num3)
        {
            System.out.println("All are the same numbers");
        }
        else
        {
            System.out.println("num3 is the largest");
        }
    }


}
