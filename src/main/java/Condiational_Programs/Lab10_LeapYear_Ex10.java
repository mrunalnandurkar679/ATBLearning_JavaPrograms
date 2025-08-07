package Condiational_Programs;



import java.util.Scanner;

public class Lab10_LeapYear_Ex10 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scan.nextInt();
        leapYear(year);

    }

    static void leapYear(int year)
    {
        if ((year %4 == 0 && year %100 !=  0) || (year % 400 == 0))
        {
            System.out.println("entered year is a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
