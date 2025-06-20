package ForLoop_Package;

import java.util.Scanner;

public class Lab10_ForLoopAddition_Ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i =1;
        whileFun(i, num);
        forLoopFun(i, num);

    }
    static void whileFun( int i,int num) {
         int sum = 0;

        while (i <= num) {

            sum += i;
            i++;


        }
        System.out.println("while loop addition " +sum);
    }
    static void forLoopFun(int i, int num)  // sum of even numbers only
    {
         int sum = 0;
        for (i =1; i<=num ; i++)
        {
            if (i %2 == 0)
            {
                sum += i;
                System.out.println(sum);
            }


        }System.out.println("forloop addition : "+sum);
    }




}
