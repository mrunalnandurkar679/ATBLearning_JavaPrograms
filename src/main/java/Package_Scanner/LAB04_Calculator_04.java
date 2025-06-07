package Package_Scanner;

public class LAB04_Calculator_04 {

    public static double result;
    public static String lastOperation;


    public LAB04_Calculator_04()
    {
        result = 0;
        lastOperation = "None";

    }

    public double add(int num1, int num2)
    {
        result = num1 + num2;
        lastOperation = "addition";
        return result;
    }

    public double substraction(int num1, int num2)
    {
        result = num1 - num2;
        lastOperation = "substraction";
        return result;
    }

    public void multiplication(int num1, int num2)
    {
        result = num1 * num2;
        lastOperation = "multiplication";
        System.out.println(result);
    }

    public double division(int num1, int num2)
    {
        if (num2 ==0)
        {
            throw new ArithmeticException(" num is not divisible by 0");
        }
        result = num1/num2;
        lastOperation = "division";
        return result;
    }

    public  String getLastOperation()
    {
        return lastOperation;
    }



}
