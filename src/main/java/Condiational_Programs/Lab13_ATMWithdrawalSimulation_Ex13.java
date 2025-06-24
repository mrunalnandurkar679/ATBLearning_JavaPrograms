package Condiational_Programs;

import java.util.Scanner;

public class Lab13_ATMWithdrawalSimulation_Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        float balance = 10000.00f;
        System.out.println(withdrawalCondition(amount, balance));

    }
    static float withdrawalCondition(float amt, float bal)
    {
        float remainbalance = 0;
        if((amt < bal) && (amt%100==0))
        {
            remainbalance = bal-amt;
            System.out.println("balance remain after withdrwan balance remain in your account "+remainbalance );

        }
        else if(amt %100 !=0)
        {   remainbalance = bal;
            throw new RuntimeException("amount can not be withdrawal balance remain in your account" +remainbalance);
        }


        else if(amt<=0)
        {
            throw new RuntimeException("entered amount is not valid");
        }else{
        throw new RuntimeException("available amount is insufficient");

        }
        return remainbalance;

    }
}
