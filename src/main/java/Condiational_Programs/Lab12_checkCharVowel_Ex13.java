package Condiational_Programs;

import java.util.Scanner;

public class Lab12_checkCharVowel_Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the aphabate");
        char alphabate = scan.next().toLowerCase().charAt(0);

        switch (alphabate)
        {
            case 'a':
                case 'e':
            case 'i':
            case 'o':
                case'u':
                System.out.println("alphabate is vowel" );
            default:
                System.out.println("it is consent ");}
        }


    }

