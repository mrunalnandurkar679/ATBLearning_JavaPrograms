package Package_Scanner;

import java.util.Scanner;

public class LAB01_Scanner_01 {


    public static void main(String[] args) {
        sum();


    }
     public static void sum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1 = scan.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = scan.nextInt();
        int sum = num1+num2;
        System.out.println(sum);

    }
}
