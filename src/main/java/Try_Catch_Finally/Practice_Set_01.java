package Try_Catch_Finally;

import java.util.Scanner;

public class Practice_Set_01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        calculations_div(num1, num2);
    }

    static void calculations_div(int num1, int num2) throws Exception {
        int div = num1/num2;
        try
        {
            if (num2 ==0)
            {
               div = num1/num2;
            }

        }
        catch (ArithmeticException e)
        {
            System.out.println("hahahhahah");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Heheheheh");
        }
        finally {
            System.out.println(div);
        }
    }


}


