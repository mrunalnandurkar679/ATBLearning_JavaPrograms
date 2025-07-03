package JavaTasks;

import java.util.Scanner;


//ArmstrongNum = 153 = 1^3+5^3+3^3
public class Lab01_ArmstrongNum_Ex01 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int orginalnumber = number;
        int result =0;
        int n = 0; // number of digits used in number

        //count the number of digits

        int temp = number;
        while (temp !=0)
        {
            temp /=10;
            n++;
            System.out.println(temp);
        }

        temp = number ;
        while (temp != 0)
        {
            int digit = temp %10;
            result += Math.pow(digit, n);
            temp /=10;
            System.out.println(digit);
        }

        if (result == orginalnumber)
        {
            System.out.println(orginalnumber + " is an Armstrong number.");
        }
        else
        {
            System.out.println(orginalnumber +"is not an Armstrong number ");
        }




    }
}
