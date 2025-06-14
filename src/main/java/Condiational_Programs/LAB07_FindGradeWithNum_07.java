package Condiational_Programs;

import java.util.Scanner;

public class LAB07_FindGradeWithNum_07 {

    static Scanner scan = new Scanner(System.in);
    static int num1 = scan.nextInt();
    static int num2 = scan.nextInt();
    static int num3 = scan.nextInt();
    static int num4 = scan.nextInt();
    static int num5 = scan.nextInt();
    static int num6 = scan.nextInt();
    static float avg = (num1+num2+num3+num4+num5+num6)/6;
    public static void main(String[] args) {
        System.out.println(avg);
        grade();

    }

    static void grade()
    {
        if(avg>=90){
            System.out.println("Students falls under grade A+");
        }
        else if(avg<90 & avg >= 80 )
        {
            System.out.println("Students falls under Grade A");
        }
        else if(avg<80 & avg >= 70 )
        {
            System.out.println("Students falls under Grade B");
        }
        else if(avg<70 & avg >= 60 )
        {
            System.out.println("Students falls under Grade c");
        }
        else if(avg<60 & avg >= 40 )
        {
            System.out.println("Students falls under Grade d");
        }
        else {
            System.out.println("Students are failed");
        }
    }
}
