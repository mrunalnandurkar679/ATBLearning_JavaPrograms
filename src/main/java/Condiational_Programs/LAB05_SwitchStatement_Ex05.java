package Condiational_Programs;

import java.util.Scanner;

public class LAB05_SwitchStatement_Ex05 {

    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println(" enter the day of a week");
        String day = scan.next();
        week(day);

    }
    public static void week(String day)
    {
       switch (day)
       {
           case "mon":
               System.out.println("Today is Monday");
               break;
           case "tue":
               System.out.println("Today is Tuesday ");
               break;

           case "wed":
               System.out.println("Today is Wednesday");
               break;

           case "Thur":
               System.out.println("Today is Thursday");
               break;
           case "Fri":
               System.out.println("Today is Friday");
               break;
           case "Sat":
               System.out.println("Today is a weekend");
               break;
           case "Sun":
               System.out.println("Today is a weekend");
               break;
           default:
               System.out.println("not falling under the days");
               break;
       }


    }
}
