package JavaTasks;

import java.util.Scanner;

public class Lab08_NumDevby5And11_Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = scan.nextInt();
        divsion(num);
    }

    static int divsion(int number)
    {
        if(number%5 ==0 && number%11 ==0)
        {
            System.out.println("given number is devisible by 5 and 11 both");
        }

        return number;
    }
}
