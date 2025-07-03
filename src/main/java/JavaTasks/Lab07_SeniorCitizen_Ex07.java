package JavaTasks;


import java.util.Scanner;

public class Lab07_SeniorCitizen_Ex07 {
    //Find if a Person is Senior Citizen Based on Age.//
//        :- take the age input from the user.//
//        Implement Age Category Logic://
//        Define the criteria for different age categories://
//        Child: Age 0 to 12//
//        Teenager: Age 13 to 19//
//        Adult: Age 20 to 64
    //Senior Citizen: Age 65 and older

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        ageCriteria(age);
        scan.close();

    }
    static void ageCriteria(int age)
    {

            if(age>0 && age<=12)
            {
                System.out.println("age is falling under child category ");
            }
            else if(age>13 && age<=19)
            {
                System.out.println("age is falling under Teenager category ");
            }
            else if(age>20 && age<=64)
            {
                System.out.println("age is falling under adult category ");
            }
            else
            {
                System.out.println("age is falling under seniorcitizen category ");
            }


        return;
    }
}
