package ForLoop_Package;

import java.util.Scanner;

public class Lab10_ForLoopAddition_Ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 1;
        int result = whileFun(i, num);
        System.out.println("Addition of all number : "+result);

        int result1 = forLoopFun(i, num);
        System.out.println("Addition of even number : " + result1);


    }

    static int whileFun(int i, int num) {
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;

        }
        System.out.println("addition of all numbers ");
        return sum;


    }

    static int forLoopFun(int i, int num)  // sum of even numbers only
    {
        int sum = 0;
        for (i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        return sum;


    }


}


