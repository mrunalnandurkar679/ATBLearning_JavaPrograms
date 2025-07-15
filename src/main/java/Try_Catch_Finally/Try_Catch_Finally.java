package Try_Catch_Finally;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 =scan.nextInt();
        int num2 = scan.nextInt();
        div(num1, num2);
        try{
            int num3 = num1/num2;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("need to execute ");
        }


    }

    static void div (int a , int b) throws ArithmeticException
    {
        int div = a/b;
        if (b == 0)
        {
            throw new ArithmeticException("number can not be divided 0");
        }


    }
}
