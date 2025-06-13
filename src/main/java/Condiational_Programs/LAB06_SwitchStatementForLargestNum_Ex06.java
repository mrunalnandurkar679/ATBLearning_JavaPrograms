package Condiational_Programs;

import java.util.Scanner;

public class LAB06_SwitchStatementForLargestNum_Ex06 {
    static Scanner scan = new Scanner(System.in);
    static int num = scan.nextInt();

    public static void main(String[] args) {
        largest();


    }
    public static void largest()
    {
        switch (num)
        {
            case 1:
                System.out.println("num is the largest");
            case 2:
                System.out.println("num is the smallest");
                break;
            default:
                System.out.println("num is equal");

        }
    }
}
