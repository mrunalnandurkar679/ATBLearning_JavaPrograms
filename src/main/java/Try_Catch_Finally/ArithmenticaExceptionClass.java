package Try_Catch_Finally;

import java.nio.channels.FileLock;
import java.util.Scanner;

public class ArithmenticaExceptionClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
       try {
            division(num1, num2);
           System.out.println("Division of two munbers are :");
        } catch (Exception e)
        {
            System.out.println("division is failed due to reason");
            System.out.println(e);
        }
       finally {
           System.out.println("needs to execute");
       }

    }

    static float division(float num1, float num2)  {
        float division = num1/num2;
        System.out.println(division);
        if(num2 ==0)
        {
            throw new ArithmeticException("Number can not be divided by 0");
        }

        return division;


    }
}
