package Functions_And_ReturnType;

import java.util.Scanner;

public class Lab01_CalculatorClass_Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number num1 : ");
        int a =0;   int b = 0;

        // edge case scenario
        try
        {
            a = scan.nextInt();
        }catch (Exception e)
        {
            System.out.println("warning :  plese enter the integer only");
            return;
        }
        System.out.println("enter the number num2 : ");

        try {
            b = scan.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("warning :  plese enter the integer only");
            return;

        }

        //calling methods

        System.out.println(addition(a,b));
        System.out.println(substraction(a,b));
        System.out.println(multiplication(a,b));
        System.out.println(division(a,b));
        System.out.println();


    }

    static int addition(int a , int b)
    {
         int sum = a+b;
        System.out.println("addition of 2 numbers : " +sum);
        return sum;
    }

    static int substraction (int a, int b)
    {
        int sub = a-b;
        System.out.println("subtraction of 2 numbers are : " +sub);
        return sub;
    }
    static int multiplication(int a, int b)
    {
      int mul = a*b;
        System.out.println("multiplication of 2 numbers are : " +mul);
        return mul;
    }

    static float division (int a , int b)
    {
        float div = a/b;
        System.out.println("division of 2 numbers are : " +div);

        if (b ==0)
        {
            throw new ArithmeticException ("not divisible by 0");
        }
        return div;
    }

}
