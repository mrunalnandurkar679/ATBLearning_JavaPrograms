package ForLoop_Package;

import java.util.Scanner;

public class Lab11_ReverseTable_Ex11 {
    public static void main(String[] args) {

        int num = 1;
        int i =10 ;
        mutiplication(num, i);
    }

    static void mutiplication(int num, int i )
    {

        for (num =1 ; num<=10; num++)

        {
            System.out.println(">...reverse table of num " + num+"   ");
            int mul = 0;
            for (i =10; i>=1; i--)
            {
                 mul = i*num;
                System.out.println(+i +"*" +num +" = " +mul);
            }

        }
    }
}
