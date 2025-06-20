package ForLoop_Package;

import java.util.Scanner;

public class Lab07_BreakContinueCombined_Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        int num = scan.nextInt();
        breakContinueFun(num);
        int sum = 0;
    }

    static void breakContinueFun(int num)
    {
        for (int i = 0; i < 5 ; i++)
        {
            if (num == 0)
            {
                break;
            }
            System.out.println("if entered number is 0 then loop  should be exited ");
            if (num < 0)
            {
                continue;
            }
            System.out.println("loop should be skipped for the negative number ");
        }


    }
}
