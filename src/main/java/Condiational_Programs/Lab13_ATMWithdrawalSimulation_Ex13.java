package Condiational_Programs;

import java.util.Scanner;

public class Lab13_ATMWithdrawalSimulation_Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        float balance = 10000.00f;
        try
        {

            withdrawalCondition(balance,amount);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    static float withdrawalCondition(float amt, float bal)
    {
        float remainbalance =bal-amt;
        if(amt<=0)
        {
            throw new RuntimeException("entered amount is not valid");
        }
       while(bal>=amt) {

            if ((amt<=bal) && (amt % 100 == 0) ) {
                System.out.println("withdrawal successful balance remian is " + remainbalance);
                break;
            }
        }
         if(amt %100 !=0)
        {
            throw new RuntimeException("amount can not be withdrawal balance remain in your account  " +bal);
        }
        else
        {
        throw new RuntimeException("available amount is insufficient");

        }


    }
}
