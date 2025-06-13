package Increment_Package;

import java.util.Scanner;

public class Lab01_PostIncrement
{
    static Scanner scan = new Scanner(System.in);
    static int num = scan.nextInt();
    public static void main(String[] args) {
        System.out.println(num++); //10
        System.out.println(num); //11
        System.out.println(num + num); //11 + 11

    }
}
