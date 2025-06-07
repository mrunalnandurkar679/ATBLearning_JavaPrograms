package Package_Scanner;

import static Package_Scanner.LAB01_Scanner_01.num1;

public class LAB03_CalculatorMain_03 {

    public static void main(String[] args) {

        LAB04_Calculator_04 cal = new LAB04_Calculator_04();
        cal.multiplication(12,13);
        System.out.println(cal.add(12,13));
        System.out.println(cal.substraction(12,13));
        System.out.println("show last operation----" + cal.getLastOperation());
        try {
            System.out.println(cal.division(14, 0));
        }catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            cal.division(num1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error handling demonstration:");
            System.out.println(e.getMessage());
        }


    }
}
