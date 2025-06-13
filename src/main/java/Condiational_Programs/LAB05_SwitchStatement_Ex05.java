package Condiational_Programs;

import java.util.Scanner;

public class LAB05_SwitchStatement_Ex05 {

    static Scanner scan = new Scanner(System.in);
    static int day = scan.nextInt();


    public static void main(String[] args) {
        day();

    }
    public static void day()
    {
       switch (day)
       {
           case 1:
               System.out.println("Today is Sunday");
               break;

           case 2:
               System.out.println("Today is Monday");
               break;

           case 3:
               System.out.println("Today is Tuesday");
               break;

           case 4:
               System.out.println("Today is Wednesday");
               break;

           case 5:
               System.out.println("Today is Thursday");
               break;
           case 6:
               System.out.println("Today is Friday");
               break;
           case 7:
               System.out.println("Today is Saturday");
               break;
           default:
               System.out.println("Today is weekend");
               break;
       }


    }
}
