package Condiational_Programs;

import java.util.Scanner;

public class LAB01_PositiveNum_01 {






        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println("Enter the number " + num);
            if (num > 0) {
                System.out.println("number is positive");

            } else {
                System.out.println("number is negative");
            }
        }
    }
