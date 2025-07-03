package JavaTasks;
//Calculate Bonus Based on Salary and Years of Experience.
//
//        :- take the salary and Year info from the User.
//
//        Implement Bonus Calculation Logic:
//
//        Define the bonus structure based on salary and years of experience.
//
//        :- If years of experience is less than 1 year: No bonus.
//
//        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//
//        :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//
//        :- If years of experience is greater than 6 years: Bonus is 15% of the salary.


import java.util.Scanner;

public class Lab04_SalaryBonus_Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the year : ");
        int exeperienceyear = scan.nextInt();
        System.out.println("enter the salary : ");
        double salary = scan.nextDouble();

        bonus(exeperienceyear, salary);

    }

    static double bonus(int year, double salary)
    {

        double bonuses =0;

        if (year<=1)
        {
            System.out.println("user will not get any bonus");
        }
        else if(year>1 && year<=3)
        {
            bonuses = salary*.05;
            System.out.println("bonus : "+bonuses);
        }
        else if(year>4 && year<=6)
        {
            bonuses = salary*0.1;
            System.out.println("bonus : "+bonuses);
        }
        else if(year >6)
        {
            bonuses = salary*.15f;
            System.out.println("bonus : "+bonuses);
        }


        return bonuses;
    }


}
