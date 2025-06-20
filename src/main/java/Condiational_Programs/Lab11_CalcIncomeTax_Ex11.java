package Condiational_Programs;

import java.util.Scanner;

/*
* 1.  salary range : 2.5l to 5l  tax 5%
* 2. salary range : 5l to 10l  tax 10%
* 3. salary range : above 10l  tax 30%
* */

public class Lab11_CalcIncomeTax_Ex11 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the annuam income in lakhs : ");
        float income = scan.nextFloat();

        incomeTax(income);
    }

    static float incomeTax(float income) {
        float tax =0 ;
        if (income <= 2.5f) {
            tax = income * 0;
            System.out.println("Tax for the salary less than 2.5 Lakhs  : " + tax);
        } else if (income <= 5f) {
            tax = tax + ((income - 2.5f) * 0.05f);
            System.out.println(tax);
            System.out.println("Tax for the salary  between  2.5 Lakhs to 5 Lakhs   : " + tax);
        } else if (income <= 10.0f) {
            tax = tax + (5f - 2.5f) * .05F;
            System.out.println(tax);
            float tax1 = tax + (income - 10.0f) * 0.1f;
            System.out.println(tax1);
            System.out.println(tax + tax1);


            System.out.println("Tax for the salary  between 5 Lakhs to 10 Lakhs   : " + tax);
        } else {
            tax = tax + (5f - 2.5f) * .05F;
            System.out.println(tax);
            tax = tax + (10f - 5f) * .1f;
            System.out.println(tax);
            System.out.println(tax = tax + (income - 10f) * 0.3f);
            System.out.println("Tax for the salary  above  10 Lakhs : " + tax);
        }
        return tax;


    }


}
