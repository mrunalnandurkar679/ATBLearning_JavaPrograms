package Package_Scanner;

public class LAB03_CalculatorMain_03 {

    public static void main(String[] args) {

        LAB04_Calculator_04 cal = new LAB04_Calculator_04();
        cal.multiplication(12,13);
        System.out.println(cal.add(12,13));
        System.out.println(cal.substraction(12,13));
        System.out.println("show last operation----" + cal.getLastOperation());


    }
}
