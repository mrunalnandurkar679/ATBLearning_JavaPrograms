package Package_Scanner;

import java.util.Scanner;

public class LAB01_Scanner_01 {

    static int num1;
    static int num2;
    static int sum;
     static LAB02_Scanner02 scan2 = new LAB02_Scanner02();


    public static void main(String[] args) {
        sum();
       scan2.multi();


    }
     public static void sum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 1st number");
        num1 = scan.nextInt();
        System.out.println("enter the 2nd number");
        num2 = scan.nextInt();
        sum = num1+num2;
        System.out.println(sum);

    }
}
