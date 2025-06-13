package Condiational_Programs;

import java.util.Scanner;

public class Lab03_EvenOddNumber_Ex03 {
    static Scanner scan = new Scanner(System.in);
    static int num = scan.nextInt();
    public static void main(String[] args) {
        Lab03_EvenOddNumber_Ex03.Number();

    }
    public static void Number()
    {
        if (num %2 == 0)
        {
            System.out.println("number is odd");
        }
        else
        if(num ==0)
        {
            boolean ArithmeticException;
            throw new ArithmeticException("number can not be divisible");
        }
        else {
            System.out.println("number is even");
        }

    }
}
