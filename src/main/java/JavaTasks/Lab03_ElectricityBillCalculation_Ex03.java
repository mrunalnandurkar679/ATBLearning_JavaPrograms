package JavaTasks;
//Electricity Bill Calculation (Based on Units Consumed)
//
//        :- take the input from the user of Units.
//
//        Implement Rate Structure:
//
//        Define the rate structure for calculating the bill based on the number of units consumed.
//
//        :-  First 100 units: 0.50Rs per unit
//
//        :-  Next 100 units (101-200): 0.75Rs per unit
//
//        :- Next 100 units (201-300): 1.20Rs per unit
//
//        :- Above 300 units: 1.50Rs per unit

import java.util.Scanner;

public class Lab03_ElectricityBillCalculation_Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int units = scan.nextInt();
        System.out.println(electricityBill(units));

    }
    static float electricityBill(int unit) {
        float bill = 0;
        if (unit <= 100) {
                bill = unit * 0.50f;
                System.out.println(bill);
            }
            else if (unit <= 200) {
                bill = (100 *0.5f) +(unit-100)*0.75f ;

            }
            else if(unit<=300)
            {
                bill = (100 *.5f) +(100*.75f) +((unit-200)*1.20f);
            }
            else {
                bill = (100 *.5f) +(100*.75f) +(100*1.20f) + (unit-300)*1.5f;
            }


         return bill;      }

}

